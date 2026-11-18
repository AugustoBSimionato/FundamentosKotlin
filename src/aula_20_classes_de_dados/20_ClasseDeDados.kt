package aula_20_classes_de_dados

class UserClass(val name: String, val age: Int)
// classe normal

data class UserDataClass(val name: String, val age: Int)
// data class no terminal mostra que é um dado
// precisa de pelo menos um atributo para ser criada
// não podem ser usadas com open para extende-las

fun main() {

    val userClass = UserClass(name = "João", age = 20)
    val userDataClass = UserDataClass(name = "João 2", age = 21)

    // toString

    println(userClass.toString())
    println(userDataClass.toString())

    // equals

    val jose = UserDataClass(name = "José", age = 30)
    val maria = UserDataClass(name = "Maria", age = 40)
    val jose2 = UserDataClass(name = "José", age = 30)

    val userClass2 = userClass

    println(jose == jose2) //sempre compara os valores das propriedades, então é true
    println(userClass == userClass2) //aqui da false por conta de instâncias diferentes e true quando uma recebe a outra

    // copy

    val copyMaria = maria.copy(age = 50) //copy serve para mudar os dados dos atributos/valores

    println(copyMaria)

    // destructuring

    val (name, age) = jose //desestrutura a data class para encontrar informação de forma mais granular para abstrair dados

    println(name)
    println(age)
}