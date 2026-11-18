package aula_24_classes_enumeradas

//dentro do escopo consegue alocar instancias que fazem parte da Direction
//usa palavras maiúsculas para contextos fixos

enum class Direction(val description: String) {
    NORTH(description = "Direção norte.") { // 0
        override fun symbol(): Char {
            return '↑'
        }

        override val symbol: Char
            get() = '↑'
    },
    SOUTH(description = "Direção sul.") { // 1
        override fun symbol(): Char {
            return '↓'
        }

        override val symbol: Char
            get() = '↓'
    },
    EAST(description = "Direção leste.") {  // 2
        override fun symbol(): Char {
            return '→'
        }

        override val symbol: Char
            get() = '→'
    },
    WEST(description = "Direção oeste.") {  // 3
        override fun symbol(): Char {
            return '←'
        }

        override val symbol: Char
            get() = '←'
    };

    companion object { //fazer parte do contexto estático da classe
        fun sumDirection(firstDirection: Direction, secondDirection: Direction) {
            println(firstDirection.description)
            println(secondDirection.description)
        }
    }

    fun addDirection(direction: Direction) {
        println(this.description) //direcao do proprio item
        println(direction.description)
    }

    abstract fun symbol(): Char //método abstrato singleton
    abstract val symbol: Char
}

fun main() {

    val north = Direction.NORTH

//    println(north.ordinal) //posicao relacionada dentro da classe enumerada
//    println(north.name) //nome relacionado dentro da classe enumerada
//    println(north.description) //acessa propriedade da classe enumerada
//
//    north.addDirection(direction = Direction.EAST)
//
//    Direction.sumDirection(firtDirection = Direction.SOUTH, secondDirection = Direction.WEST)

    // entries -> todos os item completos das direções, todos os items da classe Direction

    Direction.entries.forEach { item ->
        println(item.symbol() + " | " + item.symbol)
    }

    // valueOf -> encontrar algum item baseado no valor do item que quer encontrar

//    println(Direction.valueOf("SOUTH").ordinal)
}