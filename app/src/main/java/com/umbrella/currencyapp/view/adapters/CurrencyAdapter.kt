package com.umbrella.currencyapp.view.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.umbrella.currencyapp.databinding.ItemCurrencyBinding
import com.umbrella.currencyapp.model.Currency

class CurrencyAdapter : RecyclerView.Adapter<CurrencyAdapter.MyViewHolder>() {

    private var currencyList: List<Currency> = ArrayList()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(currencyList: List<Currency>) {
        this.currencyList = currencyList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemCurrencyBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(currencyList[position])
    }

    override fun getItemCount(): Int {
        return currencyList.size
    }

    inner class MyViewHolder(private val binding: ItemCurrencyBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(currency: Currency) {
            with(binding) {
                numCodeTV.text = currency.numCode
                charCodeTV.text = currency.charCode
                nominalTV.text = currency.nominal.toString()
                currencyNameTV.text = currency.name
                valueTV.text = currency.value.toString()
            }
        }
    }
}