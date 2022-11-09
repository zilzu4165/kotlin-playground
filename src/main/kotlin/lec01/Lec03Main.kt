package lec01

class Lec03Main {
}

/**
 * 코틀린에서 Type을 다루는 방법
 */

fun main() {

}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) { // instanceof
        val person = obj as Person  // (Person) obj
        println(person.age)
    }

    if (obj is Person) {
        println(obj.age) // if 문 안에서 타입체크를 해줬으므로 형변환 안해줘도 되는 것 :: 스마트캐스트
    }
}