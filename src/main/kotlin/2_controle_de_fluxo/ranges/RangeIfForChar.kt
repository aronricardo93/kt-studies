package ranges

fun main(){
    val a = 2

    if(a in 1..5){
        println("O número 2 está nesse range") //irá printar
    }

    if(a !in 6..15){
        println("O número 2 NÃO está nesse range") //irá printar
    }

    for(x in 'a'..'d'){
        print(x)          //Saída: abcd
    }
    println()

    for(z in 'z' downTo  's' step 2){
        print(z)          //Saída: zxvt. Decremento de 2 em 2
    }
}