/*
1 - Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
“1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50”

2 - Imprima os números de 1 a 50 na mesma linha em ordem decrescente. Saída esperada:
“50 49 48 47 .. .. .. 2 1”

3 - Usando a resolução do exercício 1, não imprima os números múltiplos de 5.

4 - Faça a soma de todos os números no intervalo de 1 a 500.

5 - Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando
o caracter #.
Se a entrada do programa for 3, teremos:
#
##
###
Se a entrada do programa for 5, teremos:
#
##
###
####
#####
*/

fun main() {
    //imprimeCrescente()
    //imprimeDecrescente()
    //imprimeSemMultiplo(5)
    //somatorio()
    imprimeEscada(5)

}

fun imprimeCrescente() {
    for (i in 1..50) {
        print("$i ")
    }
}

fun imprimeDecrescente() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}

fun imprimeSemMultiplo(multiplo: Int) {
    for (i in 1..50) {
        if (i % 5 != 0)
            print("$i ")
    }
}

fun somatorio() {
    var somatorio: Int = 0
    for (i in 1..500) {
        somatorio += i
    }
    print("A soma é: $somatorio")
}

fun imprimeEscada(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}