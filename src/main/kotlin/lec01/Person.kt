package lec01

fun main() {
    val person = Person("박성수", 100)
    println(person.name)
    person.age = 200
    println(person.age)
}

class Person(
    val name: String,
    var age: Int)