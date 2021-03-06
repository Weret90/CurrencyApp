package com.umbrella.currencyapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.umbrella.currencyapp.model.AppState
import com.umbrella.currencyapp.model.Currency
import com.umbrella.currencyapp.model.api.ApiFactory
import kotlinx.coroutines.*

private const val CURRENCY_CLASS_FIELDS_COUNT = 7
private const val REFRESH_TIME_SEC: Long = 60

class MainViewModel : ViewModel() {

    private val currencyInfoLiveData = MutableLiveData<AppState>()
    private val timeLiveData = MutableLiveData<String>()
    private val job = viewModelScope.launch(Dispatchers.Main) {
        while (isActive) {
            makeApiCall()
            delay(REFRESH_TIME_SEC * 1000)
        }
    }

    fun repeatFunRefreshInfo() = job
    fun getCurrencyInfoLiveData(): LiveData<AppState> = currencyInfoLiveData
    fun getTimeLiveData(): LiveData<String> = timeLiveData

    fun makeApiCall() {
        viewModelScope.launch(Dispatchers.IO) {
            currencyInfoLiveData.postValue(AppState.Loading)
            try {
                val response = ApiFactory.retrofitService.getCurrencyInfo()
                val currencyList = castObjectFieldsToGeneralClassAndPutInTheList(
                    response.allCurrencyInfo.toString(),
                    response.allCurrencyInfo.javaClass.declaredFields.size
                )
                timeLiveData.postValue(response.date)
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
        val split = currencyInfo.split("+")
        val list =
            split.filter { s -> !s.contains("=") }
        val currencyList = ArrayList<Currency>()
        var stepIndex = 0
        for (i in 0 until listSize) {
            val currency = Currency(
                list[0 + stepIndex],
                list[1 + stepIndex],
                list[2 + stepIndex],
                list[3 + stepIndex].toInt(),
                list[4 + stepIndex],
                list[5 + stepIndex].toDouble(),
                list[6 + stepIndex].toDouble()
            )
            stepIndex += CURRENCY_CLASS_FIELDS_COUNT
            currencyList.add(currency)
        }
        return currencyList
    }

    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }
}