package lec01

fun main() {
    val person = JavaPerson("박성수", 100)
    println(person.name)
    person.age = 200
    println(person.age)
}

class Person(
    val name: String,
    var age: Int)
{
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }
}