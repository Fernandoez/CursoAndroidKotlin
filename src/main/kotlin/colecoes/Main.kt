package colecoes

fun main() {
    val data = listaDeDados()

    //data.any retorna true se tiver pelo menos um elemento na colecao, caso contrário false
    // Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim" else "não"}.")

    //data.count retorna quantos elementos tenho na colecao
    // Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas.")

    // Tenho alguma receita de Lasanha?                 it.atributo -> Isso é um predicado, uma cláusula, um filtro que estou informando
    println("Tenho receitas de Lasanha? ${if (data.any { it.nome == "Lasanha" }) "sim" else "não"}.")

    // Quantas receitas de Lasanha?
    println("Tenho ${data.count { it.nome == "Lasanha" }} receitas de Lasanha.")

    // Qual o nome da primeira e última receita? Caso não seleciona por atributo específico ele imprime o objeto inteiro
    println("A primeira receita é: ${data.first().nome}.")
    println("A última receita é: ${data.last().nome}.")

    // Caso a lista possa ser vazia, podemos usar as seguintes funções para evitar uma excecao. As mesmas retornariam null
    // data.firstOrNull()
    // data.lastOrNull()

    //sum e sumOf. sum não funciona nesse caso por não conseguirmos somar as Receitas, precisariamos de tipos possíveis de somar, como Int
    //sumOf para fazer a soma de uma unidade específica usando o it.atributo (numerico) -> Isso é um predicado, uma cláusula, um filtro que estou informando
    // Qual a soma de calorias?
    val sumCalories = data.sumOf { it.calorias }
    println("A soma de calorias é: $sumCalories")

    //println(data.filter { it.nome == "Lasanha" }) me retorna a receita que tenha o nome de Lasanha
    //Nesse caso, verifico se possuo alguma receita com o nome Panqueca
    // Sei como fazer panqueca?
    val knowPanqueke = data.filter { it.nome == "Panqueca" }
        .any()  // Poderia ser feito assim também simplificado: data.any { it.nome == "Panqueca" }
    println("Sei fazer panqueca? ${if (knowPanqueke) "sim" else "não"}")
    //E sushi?
    val knowSushi = data.filter { it.nome == "Sushi" }.any()
    println("Sei fazer sushi? ${if (knowSushi) "sim" else "não"}")
    //Pode-se ter mais de uma comparação dentro do filter, por exemplo: mListTwo.filter { it.contains("Curso") || it.contains("Kotlin") }.any()

    //take e take last. take é para informar os elementos a partir do inicio e takelas a partir do ultimo
    // Me dê as duas primeiras receitas
    val firstTwo = data.take(2) //dois primeiros
    val lastTwo = data.takeLast(2) //dois ultimos

    //forEach
    data.forEach { println(it.nome) } //para cada receita vai imprimir o nome
    // Quais são as comidas com mais de 500 calorias?
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    //max e min.
    //listOf(1, 4, 9).maxOf { it } ou listOf(1, 4, 9).maxOrNull() -> Se eu tiver uma coleção vazia ele vai lançar uma exceção
    //data.maxOf { it.calorias } para saber a que tem mais calorias
    //data.minOf { it.calorias } para saber a que tem menos calorias
    // Qual a receita mais calórica?
    val maisCal =
        data.maxByOrNull { it.calorias } //maxByOrNull retorna o objeto completo aplicando o filtro e não só o valor considerando o filtro
    println("Mais calórica: ${maisCal?.nome}")
    //E a menos calórica?
    val menosCal = data.minByOrNull { it.calorias }
    println("Menos calórica: ${menosCal?.nome}")

    //map posso mapear dados especificos para filtrar/criar novas listas
    // Faça uma lista com o nome dos pratos
    data.map { it.nome }
    data.map { ReceitaNIngredientes(it.nome, it.ingredientes.count()) } //mapeando para a ultima estrutura

    //average (média)
    //tem que ser aplicada em cima de uma coleção de numeros
    //data.average() não existe nesse caso, mas podemos usar outras funcoes e depois chamar average como abaixo
    // Qual a média de caloria de todas as receitas?
    val media = data.map { it.calorias }.average()
    println("A média de calorias é: $media.")

    //distinct
    // Eliminar receitas com mesmo nome
    println(data.distinctBy { it.nome }) //distinct com algum filtro, confere se possui receitas com o mesmo nome para desconsiderar
    //println(data.distinctBy { it }) -> Considera o objeto completo, se houvesse a mesma receita com uma unica diferença, traria os dois
    // Lista de dados simples
    val listaInteiros = listOf(1, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
    println("Lista distinta: ${listaInteiros.distinct()}.") //Traz apenas valores unicos, somente o valor uma vez

    // Ordenar uma lista
    listaInteiros.sorted() //de forma crescente
    listaInteiros.sortedDescending() //de forma descendente

    // Inverter uma lista
    listaInteiros.reversed() //pega a sequencia original e reverte


}

fun listaDeDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)

data class ReceitaNIngredientes(val nome: String, val nIngredientes: Int)