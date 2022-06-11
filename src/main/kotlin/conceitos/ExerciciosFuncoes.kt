/*
1 - Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
minutos e segundos. Saída desejada:
2 anos equivalem a:
24 meses
730 dias
17520 horas
1051200 minutos
63072000 segundos

2 - Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.

3 - Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).

4 - Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).

5 - Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
a. Não deve existir lógica dentro da função Colecoes.Colecoes.Colecoes.main. Deve ser usada somente como ponto de entrada.
b. Escrever uma função para a troca de letras e impressão do valor final.
c. String final deve estar com todas as letras minúsculas.

6 - Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se
sim, transforme-as.
*/
fun main() {
    converteAnos(2)
    println("Quantidade de caracteres da palavra Avenida: ${qtdCaracteres("Avenida")}")
    println("O cubo de 3 é: ${calculaCubo(3)}")
    println("A quantidade de KM de 3 milhas é: ${converteMilhas(3.0f)}km")
    trocaLetras("Abacaxi")
}

fun converteAnos(ano: Int) {
    println("$ano anos equivalem a ${ano * 12} meses")
    val dias: Int = ano * 365
    println("$ano anos equivalem a $dias dias")
    val horas: Int = dias * 24
    println("$ano anos equivalem a $horas horas")
    val minutos: Int = horas * 60
    println("$ano anos equivalem a $minutos minutos")
    val segundos: Int = minutos * 60
    println("$ano anos equivalem a $segundos segundos")
}

fun qtdCaracteres(string: String) = string.length

fun calculaCubo(numero: Int) = numero * numero * numero

fun converteMilhas(milhas: Float): Float = milhas * 1.6f

fun trocaLetras(string :String){
    println("String alterada: ${string.lowercase().replace("a", "x")}")

    /* Ou ainda
    println(string.replace("a", "x", true).lowercase())
    */
}

