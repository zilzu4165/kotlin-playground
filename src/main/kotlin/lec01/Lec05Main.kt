package lec01

class Lec05Main {
}

fun main() {
    judgeNumber(0)
}
fun judgeNumber(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어지는 숫자는 홀수입니다.")
    }
}