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

fun main() {
    maiorDeIdade(10)
    maiorDeIdade(15)
    maiorDeIdade(19)
    maiorDeIdade(61)

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
