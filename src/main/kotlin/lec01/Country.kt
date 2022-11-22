package lec01

fun handleCountry(country: Country) {  // Enum 클래스는 whne 절과 같이 사용할 때 진가를 발휘한다.
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}