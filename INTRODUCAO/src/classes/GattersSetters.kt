package classes

class cliente2{
    constructor(nome:String){
        this.nome = nome
    }
    var nome:String
        get()= "Meu nome é ${field}"
    set(value) {
        field = value.takeIf { value.isNotEmpty() }  ?: "Anonimo"
    }
}

fun main() {
    val c1 = cliente2("")
    println(c1.nome)
}