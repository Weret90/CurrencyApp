package com.umbrella.currencyapp.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import com.umbrella.currencyapp.databinding.FragmentMainBinding
import com.umbrella.currencyapp.model.AppState
import com.umbrella.currencyapp.view.adapters.CurrencyAdapter
import com.umbrella.currencyapp.viewmodel.MainViewModel

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val currencyAdapter = CurrencyAdapter()
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.currencyRecyclerView.adapter = currencyAdapter
        viewModel.getCurrencyInfoLiveData().observe(viewLifecycleOwner) { result ->
            renderData(result)
        }
        viewModel.makeApiCall()
    }

    private fun renderData(result: AppState) {
        when (result) {
            is AppState.Loading -> {
                binding.loadingLayout.visibility = View.VISIBLE
            }
            is AppState.Success -> {
                binding.loadingLayout.visibility = View.GONE
                currencyAdapter.setData(result.currencyList)
            }
            is AppState.Error -> {
                binding.loadingLayout.visibility = View.GONE
                Snackbar.make(binding.root, "Error", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Reload") {
                        viewModel.makeApiCall()
                    }.show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}