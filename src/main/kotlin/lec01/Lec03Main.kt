package lec01

class Lec03Main {
}

/**
 * 코틀린에서 Type을 다루는 방법
 */

fun main() {
    val person = Person("박성수", 100)
    val age = 29
    val height = 178

    println("이름 : ${person.name}, 나이 : $age, 키 : ${height}")
//     변수 이름만 사용하더라도 ${변수}를 사용하는 것이
//     1) 가독성
//     2) 일괄 변환
//     3) 정규식 활용
//     측면에서 좋다.
}