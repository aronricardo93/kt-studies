package functions

fun message(message: String): Unit {
    println("Unit é void ou qualquer coisa")
}

fun messagePrefix(message: String, prefix: String = "pre"){
    println("$prefix $message")
}

fun multply(n1: Int, n2: Int) = n1 * n2

fun sum(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun main(){
    message("Exemplo")
    messagePrefix("estabelecido")
    println(multply(3,3))
    println(sum(1,2))
}