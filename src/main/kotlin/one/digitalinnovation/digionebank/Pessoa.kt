package main.kotlin.one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.436.789-10"
    private set

}

fun main() {
    val jether =  Pessoa()

    println(jether)
    println(jether.nome)
    println(jether.cpf)


}