package aula_08_colecoes

fun main() {

    // set: gera coleção de elementos únicos

    val set = setOf(1, 2, 3, 2)

    val setRandom = setOf(1, 2, 3, "kotlin", "kotlin", "bernardo", 4.0, 5f, 0..100, 1, 2, 19, "kotlin2") //imutável

    val setMutable = mutableSetOf(1, 2, 3, "kotlin", "kotlin2", 4.0, 5.0)

    setMutable.add(10)
    setMutable.remove(1)

    println(setMutable)

    val hasSet = hashSetOf(1, 2, 3) //é mutável e armazena apenas elementos únicos

    // map

    val map = mapOf<Int, String>(
        Pair(1, "Kotlin"), //opcao 1
        1 to "kotlin 2", //opcao 2
        2 to "kotlin 2",
        3 to "kotlin 3",
        1 to "kotlin 3"
    )

    println(map)
    println(map.keys)
    println(map.values)
    println(map.entries)

    val mapMutable = mutableMapOf(1 to "kotlin", "kotlin" to 1, 1f to 1, 0..10 to 1) //imutável aqui

    println(mapMutable)

    val hasMap = hashMapOf(1 to "kotlin") //é mutável e armazena apenas elementos únicos
}