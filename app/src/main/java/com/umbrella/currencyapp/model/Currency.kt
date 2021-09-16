package com.umbrella.currencyapp.model

data class Currency(
    val charCode: String,
    val iD: String,
    val name: String,
    val nominal: Int,
    val numCode: String,
    val previous: Double,
    val value: Double
)