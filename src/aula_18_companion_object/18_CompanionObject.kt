package aula_18_companion_object

//similar ao static do Java

class Person {

    companion object {
        const val KEY = "12345678"
        private val KEY_2 = "1234567890"

        fun getKey(): String {
            return KEY + KEY_2
        }
    }
}

fun main() {

    val key = Person.KEY //nao precisou instanciar Person para acessar a KEY
    val jose = Person() //instancia de só Person não tem acesso ao escopo da própria classe

    val obtainKey = Person.getKey() //consegue no escopo obter a fun da classe como metodo estático,
                                    // usado quando nao precisa instanciar e quando não fazem parte do escopo definido durante o desenvolvimento
}