package lec01

class Lec03Main {
}

/**
 * 코틀린에서 Type을 다루는 방법
 */

fun main() {
    printAgeIfPerson(Person("",100))
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}