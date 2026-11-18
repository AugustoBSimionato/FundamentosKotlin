package aula_14_funcoes_extensao

fun String.isPalindrome(): Boolean { //funcao de extensao de String
    return this == this.reversed() //this palavra reservada para se referir a string aqui no caso
}

fun Double.format(decimalDigits: Int): String {
    return "%.${decimalDigits}f".format(this)
}

fun main() {

    println("radar".isPalindrome())
    println("banana".isPalindrome())

    println(3.14159.format(2))
}