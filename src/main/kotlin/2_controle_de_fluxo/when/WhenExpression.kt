package `2_controle_de_fluxo`.`when`

fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any { //when com um retorno
    val result = when (obj) { //atribui à variável result de acordo com o valor do parâmetro obj
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass
