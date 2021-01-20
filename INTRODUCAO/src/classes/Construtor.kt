package classes

class filme{
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome:String, anoLancamento:Int, genero:String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = filme("O poderoso chefao", 2004, "drama")
    println("${filme.nome} foi lancado ${filme.anoLancamento}.")
}