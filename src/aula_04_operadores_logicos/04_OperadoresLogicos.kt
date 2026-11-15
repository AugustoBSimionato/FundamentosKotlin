package aula_04_operadores_logicos

fun main() {
    val a = true
    val b = false
    val c = true

    //operador E (&&)
    val result = a && b //true apenas se os dois forem true
    val result2 = a && c

    print("Operador E:")
    println(result)
    println(result2)

    //operador OU (||)
    val result3 = a || b //retorna true se pelo menos um for verdadeiro
    val result4 = a || c

    print("Operador OU:")
    println(result3)
    println(result4)

    //operador Não (!)
    val e = true
    val f = !e //nega o contrário do atribuído

    print("Operador Não:")
    println(f)

    //operador IGUALDADE (==)
    print("Operadores igualdade e diferente de:")
    val num = 10
    val num2 = 5

    println(num == num2)

    //operador DESIGUALDADE (!=)
    println(num2 != num)

    //operadores É DO TIPO e NÃO É DO TIPO (is e !is)
    print("Operadores É DO TIPO:")
    val num3: Any = 1
    val numText: Any = "1"

    println(num3 is String)
    println(numText is String)

    print("Operadores NÃO É DO TIPO:")
    println(num3 !is String)
    println(numText !is String)

    //operadores PERTENCE e NÃO PERTENCE (in e !in)
    val range = 1..10
    val x = 5
    val y = 15

    print("Operador PERTENCE:")
    println(x in range)
    println(y in range)

    print("Operador NÃO PERTENCE:")
    println(x !in range)
    println(y !in range)
}