package com.umbrella.currencyapp.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.umbrella.currencyapp.R
import com.umbrella.currencyapp.databinding.FragmentCurrencyDetailBinding
import com.umbrella.currencyapp.model.Currency

private const val ARG_INFO = "ARG_INFO"

class CurrencyDetailFragment : Fragment() {

    private var _binding: FragmentCurrencyDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCurrencyDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        savedInstanceState?.let {
            binding.infoTV.text = it.getString(ARG_INFO)
        }
        arguments?.let {
            val currency = it.getParcelable<Currency>(ARG_CURRENCY) as Currency
            binding.currencyNameTV.text = currency.name
            binding.convertButton.setOnClickListener {
                if (binding.currencyEditText.text.isNotEmpty()) {
                    val rub = binding.currencyEditText.text.toString().toDouble()
                    val rubToCurrency = rub / currency.value * currency.nominal
                    binding.infoTV.text = String.format(
                        getString(R.string.fragment_currency_detail_info_tv_text),
                        rub,
                        rubToCurrency,
                        currency.name
                    )
                } else {
                    Toast.makeText(
                        context,
                        getString(R.string.fragment_currency_detail_toast),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(ARG_INFO, binding.infoTV.text.toString())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}