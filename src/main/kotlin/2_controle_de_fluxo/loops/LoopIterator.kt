package `2_controle_de_fluxo`.loops

class Animal(val name: String)

class Zoo(val animais: List<Animal>){
    operator fun iterator(): Iterator<Animal>{
       return animais.iterator()
    }
}

fun main(){
    val animals = listOf(Animal("Tamanduá"), Animal("Leão"));
    val zoo = Zoo(animals)

    for (animal in zoo) {                                   // 3
        println("Animal: ${animal.name}")
    }
}