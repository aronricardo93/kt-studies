//OBS: O Set não permite elementos repetidos
//variavel imutável recebendo instância de conjunto mutável
val conjuntoSet: MutableSet<String> = mutableSetOf("descricao1", "descricao2", "descricao3")

fun add(descricao: String): Boolean{
    return conjuntoSet.add(descricao)
}

fun status(statusAdd: Boolean): String {
    return if (statusAdd) "foi registrado" else "não foi registrada"
}

fun main(){
    val novaDescricao: String = "descricao4"
    val descricaoExistente: String = "descricao1"

    println("A descricao ${novaDescricao} ${status(add(novaDescricao))}")
    println("A descricao ${descricaoExistente} ${status(add(descricaoExistente))}")
}
