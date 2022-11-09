package lec01

class Lec04Main {
}

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {  // Java와 다르게 객체를 비교할 때 비교 연산자를 사용하면 자동으로 compareTo를 호출해준다.
        println("Money1이 Money2보다 금액이 큽니다.")
    }

}