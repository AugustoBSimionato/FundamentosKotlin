package aula_25_classes_abstratas

abstract class Vehicle(val color: String) { //propriedade concreta
    abstract val maxSpeed: Int //propriedade abstrata
    abstract val wheelsAmount: Int

    abstract fun startMovement() //interface abstrata

    fun info() { //metodos concretos
        println("""
            Velocidade Máxima = $maxSpeed Km/h
            Quantidade de rodas = $wheelsAmount
            """.trimIndent())
    }
}

class Car(val model: String, val year: Int, color: String) : Vehicle(color = color) {
    override val maxSpeed: Int
        get() = 150
    override val wheelsAmount: Int
        get() = 4

    override fun startMovement() {
        println("Ligando o motor...")
    }

    override fun toString(): String {
        super.info() //Gera uma instância de acesso para o que está se construindo mais acima na herarquia. Isso vem da classe abstrata
        return "$model, $year"
    }
}

class Bike(color: String) : Vehicle(color = color) {
    override val maxSpeed: Int
        get() = 40
    override val wheelsAmount: Int
        get() = 2

    override fun startMovement() {
        println("Pedalando...")
    }

}

fun main() {

    val car = Car(
        model = "Chevrolet Onix",
        year = 2024,
        color = "Branco"
    )

    var bike = Bike(
        color = "Preto"
    )

    println(car)

    println(bike.maxSpeed)
    println(bike.wheelsAmount)
    bike.info() //também consegue acessar por conta da herança
}