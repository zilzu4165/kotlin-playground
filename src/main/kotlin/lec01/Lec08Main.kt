package lec01

class Lec08Main {
}

fun main() {
    repeat("Hello World", useNewLine = false) // named argument 매개변수 이름을 통해 직접 지정
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(  // default parameter 밖에서 파라미터를 넣어주지 않으면 기본값을 사용한다.
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        }else {
            print(str)
        }
    }
}