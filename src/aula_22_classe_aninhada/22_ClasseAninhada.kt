package aula_22_classe_aninhada

//classe declarada dentro de um escopo de outra classe

data class Car(val model: String, val year: Int) {

    object Engine { //cria o vínculo

        data class Fuel(val typeName: String){

            fun fuelCar() {
                println("Abastecendo o carro com $typeName")
            }
        }

        fun start() { //não tem acesso as propriedades da classe superior na hierarquia
            println("Ligando...")
        }
    }
}

fun main() {

    val car = Car("Chevrolet Onix", year = 2021)
    val carEngine = Car.Engine //não instancia por conta do object

    val engine = Car.Engine

    val fuelType = Car.Engine.Fuel(typeName = "Gasolina")

}