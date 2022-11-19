package lec01

abstract class Animal(
    protected val species: String,
    protected val lecCount: Int
) {
    abstract fun move()


}