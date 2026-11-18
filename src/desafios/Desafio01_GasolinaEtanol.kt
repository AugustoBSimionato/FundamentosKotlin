package desafios

fun main() {

    println("Insira o preço por litro da GASOLINA:")
    println("R$ ")
    val precoGasolina = readlnOrNull()?.toDoubleOrNull()

    println("Insira o preço por litro do ETANOL:")
    println("R$ ")
    val precoEtanol = readlnOrNull()?.toDoubleOrNull()

    if (precoGasolina == null || precoEtanol == null) {
        println("Os valores inseridos são inválidos.")
        return
    }

    val razaoCombustivel = precoEtanol / precoGasolina

    println(
        when {
            razaoCombustivel < 0.7 -> "Etanol é mais econômico."
            razaoCombustivel > 0.7 -> "Gasolina é mais econômica."
            else -> "Ambos os combustíveis têm o mesmo custo benefício."
        }
    )
}