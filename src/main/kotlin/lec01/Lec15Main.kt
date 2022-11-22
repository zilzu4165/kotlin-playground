package lec01

class Lec15Main {
}

fun main() {
//    val numbers = listOf(100, 200) // 가변
    val numbers = mutableListOf(100, 200) // 불변


    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }
}