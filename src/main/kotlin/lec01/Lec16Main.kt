package lec01

class Lec16Main {
}

fun Person.nextYearAge(): Int {  // 확장함수와 멤버함수의 시그니처가 같으면 멤버함수가 먼저 호출된다.
    println("확장 함수")
    return this.age + 1
}

fun main() {
    3.add(4)
    3.add2(4)
    3 add2 4  // infix 함수
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}