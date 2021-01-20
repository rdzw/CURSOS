package classes

class Data(var dia: Int,var mes: Int, var ano: Int){
    fun formatar(): String{
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var nascimento: Data = Data(dia = 11, mes = 10, ano = 2006)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    with(nascimento){ println("${dia}/${mes}/${ano}")}

}