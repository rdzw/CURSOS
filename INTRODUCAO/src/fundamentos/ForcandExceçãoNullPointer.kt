package fundamentos

fun main() {
    var a: Int? = null
    println(a?.inc())

    println("Momento do erro...")
    println(a!!.inc())
}