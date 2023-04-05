
val listaMutavel: MutableList<Int> = mutableListOf(1, 2, 3) //variavel do tipo lista mutavel
val listaImutavel: List<Int> =  listaMutavel // variavel do tipo list(imutavel e que lê somente)

fun addListaMutavel(numero: Int){
    listaMutavel.add(numero)
}

fun lerListaImutavel(): List<Int>{
   return listaImutavel
}

fun main(){
    addListaMutavel(4)
    print("Total de itens na lista imutavel: ${lerListaImutavel().size}")
}