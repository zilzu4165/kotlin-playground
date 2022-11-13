package lec01

class Lec08Main {
}

fun main() {
    printAll("a", "b", "c")

    val array = arrayOf("A", "B", "C")
    printAll(*array)  // 배열 앞에 * 는 스프레드 연산자로 , 의 역할을 해준다.

}

fun printAll(vararg strings: String) {  // varage 가변인자
    for (str in strings) {
        println(str)
    }
}