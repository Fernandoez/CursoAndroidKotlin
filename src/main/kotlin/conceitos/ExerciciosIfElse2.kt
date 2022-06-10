/*
1 - Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
geométrica. Informar se formam um quadrado (lados iguais).

2 - Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
se é um triângulo equilátero (todos os lados iguais).

3 - Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
fun qualASaida(num: Int) {
 if (num >= 0) {
 if (num == 0)
 println("Primeira string")
 else println("Segunda string")     vai sair a segunda string
 }                                  e a terceira string
 println("Terceira string")
}

4 - Escreva um programa para ser usado na de portaria de um evento.
a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
permitidos.”.
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
destes. Mensagem: “Negado. Convite inválido.”.
c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.

*/
fun main() {
    //lerLadosDoQuadrado()
    //lerTriangulos()
    portaria()
}

fun lerLadosDoQuadrado() {
    println("Digite o lado 1: ")
    val num1 = readLine()
    println("Digite o lado 2: ")
    val num2 = readLine()

    if (num1 != null && num1 != "" && num2 != null && num2 != "") {
        if (num1.toInt() == num2.toInt())
            println("Esses numeros formam um quadrado")
        else
            println("Esses numeros não formam um quadrado")
    } else {
        println("Faltou um número, o programa será encerrado")
    }

}

fun lerTriangulos() {
    println("Digite o lado 1: ")
    val num1 = readLine()
    println("Digite o lado 2: ")
    val num2 = readLine()
    println("Digite o lado 3: ")
    val num3 = readLine()
    if (num1 != null && num1 != "" && num2 != null && num2 != "" && num3 != null && num3 != "") {
        if (num1 == num2 && num2 == num3)
            println("É um Triângulo Equilátero")
        else if ((num1 == num2 && num2 != num3) || num1 != num2 && num2 == num3 || num1 != num2 && num1 == num3)
            println("Triângulo Isósceles")
        else
            println("Trâgulo Escaleno")
    } else
        println("Dados nulos")
}

fun portaria() {
    println("Por favor informe a idade: ")
    val idade = readLine()
    if (idade != null && idade != "") {

        if (idade.toInt() >= 18) {
            println("Informe o tipo de convite: ")
            var convite = readLine()
            if (convite != null && convite != "")
                convite = convite.lowercase()

            if (convite != "comum" && convite != "premium" && convite != "luxo") {
                println("Negado. Convite inválido.")
            } else {

                println("Informe o código do produto")
                var codigo = readLine()
                if (codigo != null && convite != "") {
                    codigo = codigo.lowercase()

                    when (convite) {
                        "comum" -> {
                            if (codigo.startsWith("xt"))
                                println("Welcome :)")
                            else
                                println("Negado. Convite inválido.")
                        }
                        "premium" -> {
                            if (codigo.startsWith("xl"))
                                println("Welcome :)")
                            else
                                println("Negado. Convite inválido.")
                        }
                        "luxo" -> {
                            if (codigo.startsWith("xl"))
                                println("Welcome :)")
                            else
                                println("Negado. Convite inválido.")
                        }
                    }
                }
            }
        } else
            println("Negado. Menores de idade não são permitidos.")
    } else
        println("Erro na inserção dos dados")
}