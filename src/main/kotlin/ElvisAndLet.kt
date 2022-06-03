fun main() {

}

fun elvisOperator() {
/*
Operador Elvis :?
Importante que seja usado em uma var em que o retorno pode ser nulo
Se a parte esquerda da expressão for nulo, retorna a parte da direita.
*/
    val str: String? = null

    // Verificação padrão
    if (str == null) {
        println("NULO")
    } else {
        println(str)
    }

    // Operador Elvis
    println(str ?: "NULO")
    //Importante ressaltar que na direita pode ir várias coisas, por exemplo:
    //println(str ?: umaFuncao())
    //println(str ?: 10)
}

fun palavraLet(){
    val str: String? = null

    // O bloco dentro do let só é executado se o valor é diferente de nulo
    // O bloco let cria algo chamado "scope function" que é basicamente um escopo específico
    // para o objeto referenciado, no caso "str".
    // Dentro do bloco let, a referência ao objeto passa a ser "it".
    str?.let {
        println("Scope function")
        it.uppercase()
        it.length
    }
}