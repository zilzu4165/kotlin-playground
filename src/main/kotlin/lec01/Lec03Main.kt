package lec01

class Lec03Main {
}

/**
 * 코틀린에서 Type을 다루는 방법
 */

fun main() {
    val name = "박성수"

    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
    println(str)
}