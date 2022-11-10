package lec01

class Lec05Main {
}

fun main() {

}

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}
fun validateScore(score: Int) {
    if (score in 0..100) {  // 0 이상 100 이하

    }
}


fun getPassOrFail(score: Int): String {
    return if (score >= 50) { // kotlin 에서는 if-else 문이 하나의 expression, 하나의 값으로 취급한다.
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    }else if (score >= 80) {
        "B"
    }else if (score >= 70) {
        "C"
    }else {
        "D"
    }
}