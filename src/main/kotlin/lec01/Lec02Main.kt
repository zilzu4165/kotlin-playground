package lec01

/**
 *  코틀린에서 null을 다루는 방법
 */
fun main() {
    val person = Person("A 공부하는 개발자 ")
    startsWithA(person.name)
}
fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}