package fundamentos.Controle

fun main() {
    var opcao: Int = 0

    while (opcao != -1) {
        val line = readLine()?:"0"
        opcao = line.toIntOrNull() ?: 0

        println("voce escolheu a opcao $opcao")
    }

    println("Ate a proxima !!!")
}