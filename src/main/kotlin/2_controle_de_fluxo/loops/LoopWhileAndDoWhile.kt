package `2_controle_de_fluxo`.loops

fun comerBolo() = println("Comer um bolo")
fun fazerBolo() = println("Fazer um bolo")

fun main() {
    var bolosComidos = 2
    var bolosFeitos = 6

    while (bolosComidos < 5) {
        comerBolo()
        bolosComidos ++
    }

    do {
        fazerBolo()
        bolosFeitos++
    } while (bolosFeitos < bolosComidos)
}