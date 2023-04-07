package funcoes_filter_map.map

fun main() {

    val numeros = listOf(1, -2, 3, -4, 5, -6)

    val dobro = numeros.map { x -> x * 2 }

    val triplo = numeros.map { it * 3 }

    println("Numeros: $numeros")
    println("Numeros multiplicado por 2: $dobro")
    println("Numeros multiplicado por 3: $triplo")
}