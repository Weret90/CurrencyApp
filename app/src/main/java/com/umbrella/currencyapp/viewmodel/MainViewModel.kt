package com.umbrella.currencyapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.umbrella.currencyapp.model.AppState
import com.umbrella.currencyapp.model.Currency
import com.umbrella.currencyapp.model.api.ApiFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val currencyInfoLiveData = MutableLiveData<AppState>()

    fun getCurrencyInfoLiveData(): LiveData<AppState> = currencyInfoLiveData

    fun makeApiCall() {
        viewModelScope.launch(Dispatchers.IO) {
            currencyInfoLiveData.postValue(AppState.Loading)
            try {
                val response = ApiFactory.retrofitService.getCurrencyInfo()
                val currencyList = castObjectFieldsToGeneralClassAndPutInTheList(
                    response.valute.toString(),
                    response.valute.javaClass.declaredFields.size
                )
                currencyInfoLiveData.postValue(AppState.Success(currencyList))
            } catch (error: Throwable) {
                currencyInfoLiveData.postValue(AppState.Error(error))
            }
        }
    }

    private fun castObjectFieldsToGeneralClassAndPutInTheList(
        currencyInfo: String,
        listSize: Int
    ): List<Currency> {
        val split = currencyInfo.split(",", "(", ")")
        val list =
            split.filter { s -> s.contains("=") }.map { s -> s.split("=")[1] }
        val currencyList = ArrayList<Currency>()
        var stepIndex = 0
        for (i in 0 until listSize) {
            val currency = Currency(
                list[1 + stepIndex],
                list[2 + stepIndex],
                list[3 + stepIndex],
                list[4 + stepIndex].toInt(),
                list[5 + stepIndex],
                list[6 + stepIndex].toDouble(),
                list[7 + stepIndex].toDouble()
            )
            stepIndex += 8
            currencyList.add(currency)
        }
        return currencyList
    }
}