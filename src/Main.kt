fun main() {
    val exchanger = Exchanger()

    val hryvnia = 15000.0
    val resultDollar = exchanger.exchange(hryvnia, Currency.USD)
    println("Ви обміняли $hryvnia на ${resultDollar} $")
    val resultZloty = exchanger.exchange(hryvnia, Currency.ZLT)
    println("Ви обміняли $hryvnia на $resultZloty злотих")
    val resultEuro = exchanger.exchange(hryvnia, Currency.EUR)
    println("Ви обміняли $hryvnia на $resultEuro євро")

}

enum class Currency{
    USD,
    ZLT,
    EUR
}