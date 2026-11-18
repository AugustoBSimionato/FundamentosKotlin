package aula_15_funcoes_infix

//funcoes chamadas mais de forma natural sem ter que usar () ou {}
//só funcoes de membros de uma classe ou como de extensão e só aceita um parametro
//não pode definir já um valor final/padrão da fun

infix fun Int.sum(num: Int): Int = this + num //aqui de extensao

class XY(val x: Int, val y: Int) { //aqui de classe

    infix fun sum(xy: XY): XY {
        return XY(x = this.x + xy.x , y = this.y + xy.y) //retorna segunda estancia de XY onde acessa os valores e soma eles
    }

}

fun main() {

    println(2 sum 2)

    val xy = XY(x = 3, y = 2) sum XY(x = 2, y = 2) //somando coordenadas, X de um com o X de outro
    println(xy.x)
    println(xy.y)
}