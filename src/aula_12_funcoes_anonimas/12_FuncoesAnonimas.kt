package aula_12_funcoes_anonimas

fun main() {

    var sum = 2 + 2

    val funSum = { a: Int, b: Int -> { //funSum é uma função anônimas e não conseguem alterar variáveis externas
        sum = 100
        a + b
    } }

    println(funSum(1, 2).invoke()) //retorna a execução da função como objeto
    println(sum)
}