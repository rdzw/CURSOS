package oo.heranca

fun main() {
    val Carro = Ferrari()
    Carro.acelerar()
    println(Carro)

    Carro.ligarTurbo()
    Carro.acelerar()
    println(Carro)
}