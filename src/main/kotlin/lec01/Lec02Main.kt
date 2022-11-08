package lec01

/**
 *  코틀린에서 null을 다루는 방법
 */
fun main() {
    val str: String? = null
    println(str?.length) // safe-call : null이 아닐때 동작하고 null이면 전체결과가 null
    println(str?.length ?: 0) // elvis-연산자 : 앞의 연산 결과가 null이면 뒤의 값을 사용

    println(startsWithA1(str))
    println(startsWithA3(str))
//    println(startsWithA4(str))
//    println(startsWithA4(str))
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어있습니다")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")  // !! : 얘는 절대 null이 아니라는 표현, 컴파일에러 없이 정상 동작한다.
}