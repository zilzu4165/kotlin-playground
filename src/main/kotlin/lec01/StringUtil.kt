package lec01

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

/**  * 확장함수 *
 * fun 확장하려는클래스.함수이름(파라미터): 리턴타입 {
 * // this를 이용해 실제 클래스 안의 값에 접근
 * }
 *  private, protected 함수는 가져올 수 없다. !!
 */
fun String.lastChar(): Char {
    return this[this.length - 1]
}
