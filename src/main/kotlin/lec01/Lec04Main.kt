package lec01

class Lec04Main {
}

fun main() {
    if (fun1() || fun2()){
        println("본문")
    }
}

fun fun1(): Boolean {
    println("fun 1")
    return false;
}
fun fun2(): Boolean {
    println("fun 2")
    return true;
}
