package lec01

fun main() {
    val dto1 = PersonDto("박성수", 100)
    val dto2 = PersonDto("박성수", 100)

    println(dto1)

}

data class PersonDto( // data 키워드를 붙여주면 equals, hashCode, toString을 자동으로 만들어준다.
    val name: String,
    val age: Int,
)