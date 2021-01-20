package fundamentos

import fundamentos.PacoteA.simplesFuncao as funcaoSimples
import fundamentos.PacoteA.Coisa
import fundamentos.PacoteA.FaceMoeda.CARA
import fundamentos.PacoteB.*

fun main() {
    kotlin.io.println(funcaoSimples("OK"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println("${soma(2,3)} ${subtracao(4,6)}")

}