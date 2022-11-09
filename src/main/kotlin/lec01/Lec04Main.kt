package lec01

class Lec04Main {
}

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 == money3)  // == 비교 시 equals를 간접적으로 호출해준다.

}