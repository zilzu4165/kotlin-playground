package lec01

class Lec05Main {
}

fun main() {
    judgeNumber(1)
}
fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> print("-1, 0, 1이 아닙니다.")
    }
}