package igualdade

fun main() {
 //Obs: Sets são estuturas de dados que não permitem repetições

    val autores = setOf("Shakespeare", "Hemingway", "Twain")
    val escritores = setOf("Hemingway", "Twain", "Shakespeare")

    println(autores == escritores)   //Comparação estrutural
    println(autores === escritores)  //Comparação referencial
}