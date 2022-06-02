/*
1 - Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa d’água com balões de água de
7 litros. Quantos balões cabem na caixa d’água sem que o volume seja excedido?

2 - FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
a. Quando um número for divisível por 3, imprimir Buzz.
b. Quando um número for divisível por 5, imprimir Fizz.
c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz.

3 - Escreva um programa capaz de receber um texto e imprimi-lo invertido.
Entrada: Meu nome é Julius. Saída: .suiluJ é emon ueM

4 - Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ‘x’ e ‘o’ e
retorna true ou false. Caso não exista nem ‘x’ nem ‘o’, retornar false.
“xxooox” -> true “xxxxo” -> false “bdefghjij” -> false “ooooxzzzzz” -> false
*/

fun main() {
    //caixaDAgua()
    //fizzBuzz()
    //imprimeInvertido()
    verificaCaracteres()
}

fun caixaDAgua() {
    var i = 1
    var contador = 0
    while (i + 7< 2000) {
        i += 7
        contador++
    }
    println("Balões: $contador")
}

fun fizzBuzz() {
    var i = 1
    while (i <= 50) {
        if (i % 3 == 0 && i % 5 == 0)
            println("FizzBuzz ")
        else if (i % 3 == 0)
            println("Buzz ")
        else if (i % 5 == 0)
            println("Fizz ")
        else
            println("$i ")
        i++
    }
}

fun imprimeInvertido() {
    print("Digite a String: ")
    val str = readLine()
    if (str != null && str != "") {
        var i = str.length - 1
        while (i >= 0) {
            print("${str[i]}")
            i--
        }
    } else
        print("String nula")
}

fun verificaCaracteres() {
    print("Digite a String: ")
    var str = readLine()
    if (str != null && str != "") {
        var i = 0;
        var contaX = 0
        var contaO = 0
        str = str.lowercase()
        while (i < str.length) {
            if (str[i] == 'x'){
                contaX++
            } else if (str[i] == 'o'){
                contaO++
            }
            i++
        }
        if (contaX == contaO && contaX != 0)
            print("True")
        else
            print("False")
    } else
        print("String nula")
}