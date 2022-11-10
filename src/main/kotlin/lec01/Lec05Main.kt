package lec01

class Lec05Main {
}

fun getGradeWithSwitch(score: Int): String {
    // switch case -> when
    return when (score) {  // when 역시 하나의 Expression 이기 때문에 하나의 값으로 취급된다.
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}