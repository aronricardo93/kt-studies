package ranges
fun main(){

    for(i in 0..3){
        print(i)         //Saída 0123. Inclue o 3
    }
    println(" ")

    for(i in 0 until 3){
        print(i)         //Saída 012. Exclui o 3
    }
    println(" ")

    for(i in 2 .. 8 step 2){
        print(i)         //Saída 2468. Incrementando de 2 em 2
    }
    println(" ")

    for(i in 3 downTo  0){
        print(i)         //Saída: 3210. Decrementando
    }
}