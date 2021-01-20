package Collections

fun main() {
    val numeros = Array<Int>(10) {i -> i * 10  }

    for (numero in numeros){
        println(numero)
    }
}