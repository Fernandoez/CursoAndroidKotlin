fun main() {
    /*
        Usado para tratar excecoes. Colocamos o código que pode conter as excecoes/erros dentro do "try
        no "catch" nós colocamos a possível excecao que podemos ter, no exemplo o NullPointerException.
        Definimos uma variável para ter o tipo da excecao e dentro das {} o que iremos fazer caso a excecao aconteça

        --Descobrimos o tipo da excecao que pode acontecer com a execução do programa--
    */
    try {
        val s: String? = null
        val a = 10/0

        println(s!!.length)

    } catch (e: NullPointerException){  //"e" é a variável que recebe o tipo da excecao
        println("Variável Nula")

    } catch (e: ArithmeticException) {   //Posso ter mais que um catch no mesmo try
        println("Impossível dividir por zero")

    } catch (e: Exception) {     //Exception é a excecao mais genérica que existe, todas excecoes estão abaixo dela
        println("Generica")     //Por isso é importante deixá-la por último em um cenário com vários catchs específicos
                                //Quando o primeiro catch é ativado os outros são ignorados

    //O finally é opcional no uso do try catch - Caso queira garantir a execução de alguma coisa independente do resto
    } finally {     //sempre executado, independente do queaconteça em cima
        println("Finally")
    }
    //O programa continua a execução
    println("Fim")
}