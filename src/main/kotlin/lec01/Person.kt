package lec01

fun main() {
    val person = Person("박성수", 20)
    println(person.isAdult)

}

class Person(  // --> 주 생성자(primary constructor) : 반드시 존재해야함, 단, 파라미터가 하나도 없다면 없어도 무
    val name: String,
    var age: Int
) {


    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String) : this(name, 1) {  // --> 부 생성자(secondary constructor) : this 는 다른 생성자를 가리킴
        println("부 생성자 1")
    }

    constructor() : this("이수현") {
        println("부 생성자 2")
    }

    val isAdult: Boolean = this.age >= 20
}