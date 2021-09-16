package com.umbrella.currencyapp.model

import com.google.gson.annotations.SerializedName

data class CurrencyInfoFromServer(
    @SerializedName("Date")
    val date: String,
    @SerializedName("PreviousDate")
    val previousDate: String,
    @SerializedName("PreviousURL")
    val previousURL: String,
    @SerializedName("Timestamp")
    val timestamp: String,
    @SerializedName("Valute")
    val valute: Valute
)

data class Valute(
    @SerializedName("AMD")
    val aMD: AMD,
    @SerializedName("AUD")
    val aUD: AUD,
    @SerializedName("AZN")
    val aZN: AZN,
    @SerializedName("BGN")
    val bGN: BGN,
    @SerializedName("BRL")
    val bRL: BRL,
    @SerializedName("BYN")
    val bYN: BYN,
    @SerializedName("CAD")
    val cAD: CAD,
    @SerializedName("CHF")
    val cHF: CHF,
    @SerializedName("CNY")
    val cNY: CNY,
    @SerializedName("CZK")
    val cZK: CZK,
    @SerializedName("DKK")
    val dKK: DKK,
    @SerializedName("EUR")
    val eUR: EUR,
    @SerializedName("GBP")
    val gBP: GBP,
    @SerializedName("HKD")
    val hKD: HKD,
    @SerializedName("HUF")
    val hUF: HUF,
    @SerializedName("INR")
    val iNR: INR,
    @SerializedName("JPY")
    val jPY: JPY,
    @SerializedName("KGS")
    val kGS: KGS,
    @SerializedName("KRW")
    val kRW: KRW,
    @SerializedName("KZT")
    val kZT: KZT,
    @SerializedName("MDL")
    val mDL: MDL,
    @SerializedName("NOK")
    val nOK: NOK,
    @SerializedName("PLN")
    val pLN: PLN,
    @SerializedName("RON")
    val rON: RON,
    @SerializedName("SEK")
    val sEK: SEK,
    @SerializedName("SGD")
    val sGD: SGD,
    @SerializedName("TJS")
    val tJS: TJS,
    @SerializedName("TMT")
    val tMT: TMT,
    @SerializedName("TRY")
    val tRY: TRY,
    @SerializedName("UAH")
    val uAH: UAH,
    @SerializedName("USD")
    val uSD: USD,
    @SerializedName("UZS")
    val uZS: UZS,
    @SerializedName("XDR")
    val xDR: XDR,
    @SerializedName("ZAR")
    val zAR: ZAR
)

data class AMD(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class AUD(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class AZN(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class BGN(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class BRL(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class BYN(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class CAD(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class CHF(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class CNY(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class CZK(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class DKK(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class EUR(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class GBP(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class HKD(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class HUF(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class INR(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class JPY(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class KGS(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class KRW(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class KZT(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class MDL(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class NOK(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class PLN(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class RON(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class SEK(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class SGD(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class TJS(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class TMT(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class TRY(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class UAH(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class USD(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class UZS(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class XDR(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

data class ZAR(
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("NumCode")
    val numCode: String,
    @SerializedName("Previous")
    val previous: Double,
    @SerializedName("Value")
    val value: Double
)

