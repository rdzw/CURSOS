package Funcoes

fun relacaodeTrabalho(chefe:String, funcionario:String): String{
    return "$funcionario é subordinado(a) à $chefe."


}
fun main() {
    println(relacaodeTrabalho("joao","maria"))
}