package lec01

class Lec15Main {
}

fun main() {
    val array = arrayOf(100, 200, 300)
    val plusArray = array.plus(300)
    array.plus(400)
    array.plus(500)
    for ((idx, value) in plusArray.withIndex()) {
        println("${idx} ${value}")
    }
}