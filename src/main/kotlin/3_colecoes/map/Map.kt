
const val PONTOS: Int = 15

//OBS: O Map é uma coleção de chave e valor
val conjuntoMap: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val conjuntoMapLeitura: Map<Int, Int> = conjuntoMap

fun atualizarPontosPorId(id: Int) {
    if (conjuntoMapLeitura.containsKey(id)) { /* Contém a chave id(passada por parametro) "True" */
        println("Atualizando $id...")
        conjuntoMap[id] = conjuntoMap.getValue(id) + PONTOS
    } else {
        println("Erro: Id $id não existente!")
    }
}

fun printarPontosDosIds() {
    conjuntoMapLeitura.forEach {
            chave, valor -> println("ID $chave: valor $valor")
    }
}

fun main() {
    printarPontosDosIds()
    atualizarPontosPorId(1)
    atualizarPontosPorId(1)
    atualizarPontosPorId(5)
    atualizarPontosPorId(2)
    atualizarPontosPorId(2)
    atualizarPontosPorId(2)
    atualizarPontosPorId(2)
    atualizarPontosPorId(2)
    atualizarPontosPorId(2)
    atualizarPontosPorId(10)
    printarPontosDosIds()
}