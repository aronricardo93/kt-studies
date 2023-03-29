package nullsafety

fun main(){

    var neverNull : String = "Não pode ser nulo"

    var nullable : String? = "Aceita Strings e valores nulos por conta da interrogação '?' "
    nullable = null

    var inferredNonNull = "O compilador infere uma String e não aceita valores nulos"

    fun strLength(str : String?) : Int{
        return str?.length ?: 0
    }

    println(strLength(neverNull))
    println(strLength(nullable))
}
