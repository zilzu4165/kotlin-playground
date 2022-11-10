package lec01

class Lec07Main {
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrow2(str: String): Int? {
    return try {  // try - catch 도 하나의 expression으로 취급하기 때문에 return 을 앞에 둘 수 있다.
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

