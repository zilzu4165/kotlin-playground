package lec01

/**
 *  코틀린에서 null을 다루는 방법
 */
fun main() {
    val str: String? = "abc"
    println(str?.length) // safe-call : null이 아닐때 동작하고 null이면 전체결과가 null
    println(str?.length ?: 0) // elvis-연산자 : 앞의 연산 결과가 null이면 뒤의 값을 사용
}

fun startsWithA1(str: String?): Boolean {

    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false;
    }
    return str.startsWith("A")
}