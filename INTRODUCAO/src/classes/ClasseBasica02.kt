package classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial:String){
    val nome:String = nomeInicial
}
// Instanciando

fun main() {
    val p1 = Pessoa1(nome = "Rodrigo")
    p1.nome = "Rodrigo"
    println("${p1.nome} sabe programar !!!")

    val p2 = Pessoa2("Maria")
    val p3 = Pessoa3(nomeInicial = "Keisi")
    println("${p2.nome} e ${p3.nome} sao legais")
}