/*Comparadores
Maior >
Menor <
Maior igual >=
Menor igual <=
Igual ==
Diferente !=
Negação !
Conjunção(and) &&
Disjunção(or) ||
Range -> if (n in 1..50) se nestá entre 1 e 50, considerando ambos no intervalo

Ordem de prioridade
Parenteses
Negação
Conjução
Disjunlção
*/

/*
"break" para a execução do laço de repetição e sai dele (apenas do escopo em que o break está inserido)
"continue" ignora a execução abaixo do continue na iteração atual e vai pra próxima
*/


fun main() {
    //maiorDeIdade(10)
    //maiorDeIdade(15)
    //maiorDeIdade(19)
    //maiorDeIdade(61)
    //aprendendoFor()
    //aprendendoWhile()
    aprendendoDoWhile()
}

fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("Maior de idade")
        if (idade >= 60) {
            println("Terceira idade")
        }
    } else if (idade <= 10) {
        println("Uma criança")
    } else {
        println("Menor de idade")
    }
}

//caso eu vá utilizar o "return" em condições que possuam if e else,
// ao invés de escrever dois returns posso escrever dessa maneira
fun saudacao(dia: Boolean): String {
    return if (dia) {
        "Bom dia"
    } else {
        "Boa noite"
    }
}

//Ou ainda
fun saudacao2(dia: Boolean) = if (dia) {
    "Bom dia"
} else {
    "Boa noite"
}

fun aprendendoFor() {
    for (i in 1..10) {
        print("$i ")
    }
    print("\n")

    for (j in 1..10 step 2) { //step usado (com qualquer número) para indicar pulos na sequencia
        print("$j ")
    }

    for (k in 20 downTo 0 step 3) {  //downTo para percorrer de forma descrescente, também pode ser usado o step
        print("$k ")
    }
    print("\n")

    val s = "kotlin é show"
    print("\n")
    for (char in s) {
        print("$char")
    }
}

fun aprendendoWhile() {
    var i = 0
    var j = 0
    val s = "kotlin"
    while (i < 100) {
        print("$i ")
        i++
    }
    while (i > 0) {
        print("$i ")
        i--
    }
    while (j < s.length) {
        print("${s[j]}")
        j++
    }
}

fun aprendendoDoWhile() {
    var i = 0
    do {
        print("Qual o seu nome? ")
        val value = readLine()
    } while (value == "")
}
