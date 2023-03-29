package classes

import classes.Contato.Contato
import classes.Pessoa.Pessoa

fun main(){
    val contato = Contato() //instanciando um objeto com construtor default
    val pessoa = Pessoa("Aron", 30) //instanciando um objeto com construtor personalizado

    print("Nome: ${pessoa.nome}, idade: ${pessoa.idade}") //interpolação
}