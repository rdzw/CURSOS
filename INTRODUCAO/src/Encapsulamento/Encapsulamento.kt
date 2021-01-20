package Encapsulamento

private val dentroDoArquivo = 1
// protected val protegidonaosuportadoaqui = 1
internal val dentroDoProjeto = 1
val publico = 1

private fun dentroDoArquivo() = 1
//
internal fun dentroDoProjeto() = 1
fun publico() = 1

open class Capsula{
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProjeto = 1
    val publico = 1

    private fun dentroDoObojeto()= 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    fun publico() = 1

}

class CapsulaFilha: Capsula(){
    fun veriicarAcesso(){
        //println(dentroDoObjeto)
        //println(Capsula().vaiPorHeranca)
        println(vaiPorHeranca)
        println(dentroDoProjeto)
        println(publico)
    }
}

fun verificarAcesso(){
    //println(Capsula().dentroDoObjeto)
    //println(Capsula().vaiPorHeranca)
    println(Capsula().dentroDoProjeto())
    println(Capsula().publico())
}