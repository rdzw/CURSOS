package fundamentos

fun main() {
    var opcional: String? = null
    var obrigatorio: String = opcional ?: "Valor Padrao"

    println(obrigatorio)
}