package com.umbrella.currencyapp.model.api

import com.umbrella.currencyapp.model.CurrencyInfoFromServer
import retrofit2.http.GET

interface ApiService {
    @GET("daily_json.js")
    suspend fun getCurrencyInfo(): CurrencyInfoFromServer
}