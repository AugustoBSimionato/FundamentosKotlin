package aula_02_tipos_dados

fun main() {
    //numéricos
    val byte: Byte = -128 //vai até 128
    val short: Short = 1_000 //usar o _ para entender o número
    val int: Int = 2_000_000
    val long: Long = 23242342334242

    val float: Float = 3.1415f //f no final para indicar que é float
    val double: Double = 3.14

    //texto
    val char: Char = 'a' //único caractere com minusculo ou maiusculo
    val string: String = "Hello World" //pode usar o formato de """ ou para valores usar ${}

    //boolean
    val boolean: Boolean = true

}