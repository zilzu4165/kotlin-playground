package lec01

class Lec17Main {
}

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나",3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)

    )
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {  // 이름 없는 함수 --> 람다
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }  // -> 이용한 방법

    isApple(fruits[0])
    isApple.invoke(fruits[0]) // invoke : 부르다, 호출하다


}