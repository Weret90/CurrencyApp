package com.umbrella.currencyapp.view.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.umbrella.currencyapp.R
import com.umbrella.currencyapp.databinding.FragmentMainBinding
import com.umbrella.currencyapp.model.AppState
import com.umbrella.currencyapp.model.Currency
import com.umbrella.currencyapp.view.adapters.CurrencyAdapter
import com.umbrella.currencyapp.viewmodel.MainViewModel

private const val ARG_CURRENCY_LIST = "ARG_CURRENCY_LIST"
const val ARG_CURRENCY = "ARG_CURRENCY"

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val currencyAdapter = CurrencyAdapter()
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
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
        savedInstanceState?.let {
            val savedCurrencyList =
                it.getParcelableArrayList<Currency>(ARG_CURRENCY_LIST) as ArrayList
            currencyAdapter.setData(savedCurrencyList)
        }
        currencyAdapter.setOnItemClickListener {
            val bundle = Bundle()
            bundle.putParcelable(ARG_CURRENCY, it)
            findNavController().navigate(R.id.currencyDetailFragment, bundle)
        }
        viewModel.getCurrencyInfoLiveData().observe(viewLifecycleOwner) { result ->
            renderData(result)
        }
        viewModel.getTimeLiveData().observe(viewLifecycleOwner) {
            binding.timeTV.text = it
        }
        viewModel.repeatFunRefreshInfo()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelableArrayList(ARG_CURRENCY_LIST, currencyAdapter.getData() as ArrayList)
    }

    private fun renderData(result: AppState) {
        when (result) {
            is AppState.Loading -> {
                binding.loadingLayout.visibility = View.VISIBLE
            }
            is AppState.Success -> {
                binding.timeTV.visibility = View.VISIBLE
                binding.loadingLayout.visibility = View.GONE
                currencyAdapter.setData(result.currencyList)
            }
            is AppState.Error -> {
                binding.timeTV.visibility = View.GONE
                binding.loadingLayout.visibility = View.GONE
                Snackbar.make(
                    binding.root,
                    result.error.message.toString(),
                    Snackbar.LENGTH_INDEFINITE
                )
                    .setAction(getString(R.string.snackbar_action_text)) {
                        viewModel.makeApiCall()
                    }.show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.main_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_item_refresh) {
            viewModel.makeApiCall()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}