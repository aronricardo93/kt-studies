package functions

fun message(message: String): Unit {
    println("Unit é void ou retorna qualquer coisa")
}

fun messagePrefix(message: String, prefix: String = "pre"){
    println("$prefix $message")
}

fun multiply(n1: Int, n2: Int) = n1 * n2

fun sum(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun main(){
    message("Exemplo")
    messagePrefix("estabelecido")
    println(multiply(3,3))
    println(sum(1,2))

    fun printAll(vararg messages: String) {   // varag possibilita a passagem de um número ilimitado de parâmetros "message"
        for (m in messages) println(m)        // desde que respeite o tipo, que no caso é String. Detalhe que o Kotlin permite
    }                                        // uma função dentro de outra
    printAll("Olá", "Oi", "Adeus", "Tchau", "E ai", "Qual é a boa?!")

    fun passarVarargComoArgumento(vararg entries: String){ //Vai passar o vararg como parametro e nao o valor
        printAll(*entries)
    }
}