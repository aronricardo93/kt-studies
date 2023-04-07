package `4_POO`.heranca

open class Leao(val nome: String, val origem: String) {
    fun seExpressar() {
        println("$nome, o leão é de origem $origem diz: graoh!")
    }
}

//repassando o parametro do construtor da classe Asiatico para o parametro do construtor da classe Leao
// o parametro origem tem o valor padrão "India"
class Asiatico(nome: String) : Leao(nome = nome, origem = "India")

fun main() {
    val leao: Leao = Asiatico("Rufo")
    leao.seExpressar()
}