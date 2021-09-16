package com.umbrella.currencyapp.model

sealed class AppState {
    object Loading : AppState()
    data class Success(val currencyList: List<Currency>) : AppState()
    data class Error(val error: Throwable) : AppState()
}