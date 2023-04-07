package `4_POO`.enum_class

enum class Status {
    AGUARDANDO, EXECUTANDO, FINALIZADO
}

fun main(){
    val status: Status = Status.AGUARDANDO
    val mensagem = when(status) {
        Status.AGUARDANDO -> "Está aguardando!"
        Status.EXECUTANDO -> "Está executando!"
        Status.FINALIZADO -> "Está finalizado!"
    }
    print(mensagem)
}