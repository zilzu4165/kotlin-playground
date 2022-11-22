package lec01

fun main() {
//Person.Companion.newBaby("박성수")
    Person.newBaby("박성수")
    Person.Factory.newBaby("박성수")
}

class Person private constructor(
    var name: String,
    var age: Int
){
    companion object Factory: Log{  // java 의 static, 하나의 객체로도 간주된다. 때문에 이름을 붙일 수도 있고, interface를 구현할 수도 있다.
//        private const val MIN_AGE = 0  // 컴파일 시에 변수가 할당된다. 진짜 상수에 붙이기 위한 용도. 기본타입과 String에 붙일 수 있음.
        private val MIN_AGE = 1

        @JvmStatic  // 자바에서 kotlin 의 companion object를 사용하려면 붙여줘야한다.
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person클래스의 동행 객체다.")
        }
    }
}