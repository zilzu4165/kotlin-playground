package lec01

class Lec15Main {
}

fun main() {
    val numbers = setOf(100, 200) // 가변
//    val numbers = mutableSetOf<>() Of(100, 200) // 불변


    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }
}