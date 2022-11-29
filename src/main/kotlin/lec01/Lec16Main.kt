package lec01

class Lec16Main {
}

fun Person.nextYearAge(): Int {  // 확장함수와 멤버함수의 시그니처가 같으면 멤버함수가 먼저 호출된다.
    println("확장 함수")
    return this.age + 1
}

fun main() {
    val person = Person("A", "B", 100)
    println(person.nextYearAge())

}