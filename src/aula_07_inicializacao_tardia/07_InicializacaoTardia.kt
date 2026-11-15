package aula_07_inicializacao_tardia

import kotlin.properties.Delegates

fun main() {

    // lateinit

    lateinit var a: String //será inicializada depois em algum momento e não precisa ter/não tem valor
    //não pode com tipos primitivos

    // ...

    a = "kotlin lateinit"

    println(a)

    // lazy

    val b: String by lazy { //inicialização na primeira vez que for usada, preguiçosa
        "kotlin lazy"
    }

    println(b)

    var c: Int by Delegates.notNull() //resolve a questão do lateinit com primitivos
    var d: Boolean by Delegates.notNull()
    var e: Double by Delegates.notNull()

    c = 10
}