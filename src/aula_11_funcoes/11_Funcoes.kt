package aula_11_funcoes

fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

fun main() {
    val num = 7

    println("$num é par? ${isEven(num)}")
}