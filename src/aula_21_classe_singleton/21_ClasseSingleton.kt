package aula_21_classe_singleton

//instanciacao apenas uma vez e usar globalmente na base do código
//não pode usar construtores

object DatabaseUtil {
    val url: String = "jdbc:mysql://localhost:8080/mydb"
    private val user: String = "admin"
    private val password: String = "admin"

    fun connect() {
        println("Conectando ao database $url | Usuárip: $user | Senha: $password")
    }
}

data object DatabaseHelper {

}

fun main() {

    DatabaseUtil.connect()

    println(DatabaseUtil)
    println(DatabaseHelper) //objeto que vai conter dados e são representados em uma instância apenas

}