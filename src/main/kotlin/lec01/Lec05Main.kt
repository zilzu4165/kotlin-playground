package lec01

class Lec05Main {
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {  // when 역시 하나의 Expression 이기 때문에 하나의 값으로 취급된다.
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}