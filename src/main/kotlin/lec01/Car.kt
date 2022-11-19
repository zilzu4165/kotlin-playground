package lec01

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set
}

fun main() {
    val car = Car("dddd", "aaaa", 1000)
}