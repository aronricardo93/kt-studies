package `conditional-expression`

//condicional simplista no qual retorna de forma direta o mais número
fun maiorNumero(n1: Int, n2: Int) = if(n1 > n2) n1 else n2

fun main(){
    println("O maior número é ${maiorNumero(2,4)}")
}