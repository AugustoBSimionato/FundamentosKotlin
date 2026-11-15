package aula_06_nulos

fun main() {

    var a: String? = null
    val result: String = a ?: "1" //elvis operator

    println("operador elvis")
    println(result)

    var b: Int = -1
    b = a?.toInt() ?: 0

    println("operador de chamada segura")
    println(b)

    if(a != null) {
        println(a.toInt()) //a!! para quando tem certeza que é nulo -> null safety
    }

    // operador safe cast

    val c = a as? Int //int possivelmente nulo
    println("operador safe cast")
    println(c)

    //método let contra nulos

    println("método let contra nulos") //parecido com o guard let do swift(?)
    b?.let {
        println(it)
    }
}