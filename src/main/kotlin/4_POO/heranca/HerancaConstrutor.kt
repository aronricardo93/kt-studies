package `4_POO`.heranca

open class Funcionario(val nome: String){  //Classe recebendo parametro no construtor e atribuindo ao atributo
    fun gerir(){
        println("Gerenciando a produção!")
    }
}

class Atendente : Funcionario("Carmen") {  // Todos os objetos Atendente irão ter o nome Carmen

}

fun main(){
    val funcionario: Funcionario = Atendente()

    print(funcionario.nome)
}