package lec01

class Penguin(
    species: String,
) : Animal(species, 2), Swimable, Flyable {  // extends, implement
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꿱꿱")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }
}

fun main() {
    println(JavaPenguin("펭귄").act())
    println(Penguin("펭귄").act())
}