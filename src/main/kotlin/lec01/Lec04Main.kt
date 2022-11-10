package lec01

class Lec04Main {
}

fun main() {
    // java 객체를 더하는 방법
    val javaMoney1 = JavaMoney(1_000L)
    val javaMoney2 = JavaMoney(2_000L)

    println(javaMoney1.plus(javaMoney2))

    // kotlin 객체를 더하는 방법
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)
    println(money1 + money2)

}