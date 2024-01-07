class Exchanger(
    private var rateDollar: Double = 38.4,
    private var rateZloty: Double = 7.56,
    private var rateEuro: Double = 41.54
) {

    fun exchange(hryvnia: Double, currencyToBuy: Currency): Any {
        val resOut: Double = when (currencyToBuy) {
            Currency.USD -> hryvnia / rateDollar
            Currency.ZLT -> hryvnia / rateZloty
            Currency.EUR -> hryvnia / rateEuro
        }
        return round(resOut)
    }

    private fun round(number: Double): Double {
        return Math.round(number * 100.00) / 100.0
    }

}