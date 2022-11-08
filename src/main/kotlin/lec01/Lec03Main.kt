package lec01

class Lec03Main {
}

/**
 * 코틀린에서 Type을 다루는 방법
 */

fun main() {
    // 코틀린에서는 선언된 기본값을 보고 타입을 추론한다.
    val number1 = 3 // Int
    val number2 = 3L // Long
    val number3 = 3.0f // Float
    val number4 = 3.0 // Double

    val number5: Long = number1.toLong()  // 코틀린에서는 암시적 타입변경이 불가능하기때문에 toLong()

    println(number1 + number2)

}
