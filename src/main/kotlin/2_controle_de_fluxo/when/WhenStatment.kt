package `2_controle_de_fluxo`.`when`

fun main(){
    cases(1)
    cases("Exemplo")
    cases(5.753f)
    cases("Olá")
    cases(ClasseExemplo())
}

fun cases(obj: Any){ //Any é como se fosse qualquer coisa
    when(obj){
        1 -> println("One")
        "Olá" -> println("Saudação")
        is Long -> println("Long")
        !is String -> println("Não é uma string")
        else -> println("Opção desconhecida")
    }
}

class ClasseExemplo