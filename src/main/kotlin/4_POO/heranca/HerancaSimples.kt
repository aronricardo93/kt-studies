package `4_POO`.heranca

//por padrao as classes são final e para ela ser herdada tem que ser open
open class Animal{
    open fun hello(){
        print("...")
    }
}

class Gato : Animal() { //a classe Gato está herdando Animal
    override fun hello(){
        println("Miau Miau")
    }
}

fun main(){
    val gato: Animal = Gato() //polimorfismo
    gato.hello()
}