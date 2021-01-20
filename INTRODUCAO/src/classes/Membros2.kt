package classes

class calculadora{
    private var resultado: Int = 0

    fun somar(vararg valores: Int): calculadora{
        valores.forEach{resultado += it}
        return this

    }

    fun multiplicar(valor:Int):calculadora{
        resultado *= valor
        return this
    }

    fun limpar(): calculadora{
        resultado = 0
        return this
    }

    fun print():calculadora{
        println(resultado)
        return this
    }

    fun obterResultado(): Int{
        return resultado
    }
}

fun main() {
    val calculadora = calculadora()
    calculadora.somar(1,2,3).multiplicar(3).print()
}