package aula_16_classes

import kotlin.random.Random

class Person(val name: String = "Desconhecido", lastName:String, val age: Int = 0) { //construtor primário

    val fullName: String = "$name $lastName"

    private val password: String = name + Random.nextInt(100) //private nao é exposto e só é do contexto da classe

    private fun usePassword() {
        println(password)
    }

    fun work() {
        usePassword()
        println("$name, $age trabalhando...")
    }
}

fun main() {

    val jose: Person = Person(name = "José", lastName = "Silva", age = 20) //definicao de objeto da classe
    val maria: Person = Person(name = "Maria", lastName = "Rodrigues")

    jose.work()
    maria.work()

    println(jose.fullName)
    println(maria.fullName)
}