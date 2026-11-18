package aula_27_objetos_anonimos

//úteis para quando são utilizadas temporariamente e não será usada (a interface) em outro lugar
//quando simples e quando não há necessidade de criar uma classe só para isso

interface ClickCallback {
    fun onClick()
}

fun main() {

    val x = 10

    val objectTemp = object { //não ter nome de classe vinculado, ser singleton e implementar interfaces/contrato que deve ser assinado pelos objetos
                              // anonimos e passa a ter acesso a variáveis do escopo externo de criação
        val property1: Int = 1
        val property2: String = "Kotlin"

        fun method1() {
            println(x)
        }
    }

    objectTemp.method1()

    val buttonClickCallback = object : ClickCallback { //objeto anonimo que vai implementar a interface ClickCallback
        override fun onClick() {
            println("Botão clicado!")
        }
    }

    buttonClickCallback.onClick()
}