package `4_POO`.data_class

data class Usuario(val nome: String, val id: Int){
    override fun equals(other: Any?) =
        other is Usuario && other.id == this.id
    }
fun main(){
    val usuario = Usuario("Alex", 1)
    println(usuario)

    val segundoUsuario = Usuario("Alex", 1)
    val terceiroUsuario = Usuario("Max", 2)

    println("usuario == segundoUsuario: ${usuario == segundoUsuario}")
    println("usuario == terceiroUsuario: ${usuario == terceiroUsuario}")

    // hashCode() function
    println(usuario.hashCode())
    println(segundoUsuario.hashCode())
    println(terceiroUsuario.hashCode())

    // copy() function
    println(usuario.copy())
    println(usuario === usuario.copy())
    println(usuario.copy("Max"))
    println(usuario.copy(id = 3))

    println("nome = ${usuario.component1()}")
    println("id = ${usuario.component2()}")
}