package lec01

class Lec05Main {
}

fun main() {
    val number = "A"
    println(startsWithA(number))
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}