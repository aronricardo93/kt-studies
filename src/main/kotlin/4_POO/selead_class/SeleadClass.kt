package `4_POO`.selead_class

sealed class Mamifero(val nome: String)

class Gato(val gatoNome: String) : Mamifero(gatoNome)
class Humano(val humanoNome: String, val trabalho: String) : Mamifero(humanoNome)

fun saudacaoMamifero(mamifero: Mamifero): String {
    when (mamifero) {
        is Humano -> return "Olá ${mamifero.nome}; Você trabalha como ${mamifero.trabalho}"
        is Gato -> return "Olá ${mamifero.nome}"
    }
}

fun main() {
    println(saudacaoMamifero(Gato("Snowy")))
}