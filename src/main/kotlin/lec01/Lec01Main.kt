package lec01

class Lec01Main {
    fun firstMethodOfKotlin() {
        var aaa = "aaa"
        aaa = "bbb"
        println(aaa)
    }
}

fun main() {
    var abc = "abc"
    abc = "123"
    println(abc)

    val def = "def"
//    def = "hgi"   --> val 은 불변이다.
    var longType = 1_000L
//    longType = null  --> 기본적으로 null 허용을 하지 않는다.
    var nullableLongType: Long? = 1_000L
    nullableLongType = null   // --> type에 ? 를 붙이면 null이 올 수 있다는 의미


    val lec01Main = Lec01Main()  // --> 객체 생성시 new 를 해주지 않는다. !
    lec01Main.firstMethodOfKotlin()
}