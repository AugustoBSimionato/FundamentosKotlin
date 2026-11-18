package aula_19_classe_aberta

//hierarquia entre classes (começo de abstraçao de classes igual no Java)

open class Animal(val name: String) {
    open val age: Int = 0

    open fun sound() {
        println("$name: som")
    }
}

class Dog(override val age: Int) : Animal(name = "Cachorro") {
    override fun sound() { //subescreveu o sound
        println("$name: AU!")
    }
}

fun main() {

    val dog = Dog(age = 5) //instanciamento
    dog.sound()
    println(dog.age)
}