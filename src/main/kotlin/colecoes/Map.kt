package colecoes

/*
  Map
  Mapa são listas de dados entrada-valor. Significa que para uma chave, existe um valor associado. Os tipos podem ser diferentes
  Para cada chave teremos um valor. Caso se repitam os valores, os últimos informados serão os usados
  Assim como Set, map também não permite elementos duplicados.
 */
fun main() {                                        //"Pair" usado para identificar e realizar uma entrada
    val map1: Map<String, String> = mapOf(
        Pair("França", "Paris"),
        Pair("França", "xpto")
    )  //Caso se repitam os valores, os últimos informados serão os usados
    val map2 = mutableMapOf(Pair("França", "Paris"), Pair("França", "Paris"))

    //Conjunto chaves valores. Caso se repitam os valores, os últimos informados serão os usados
    println(map1)

    // Todas as entradas, ou seja, chaves
    println(map1.keys)

    // Todas os valores, ou seja, quais são os valores associados as chaves
    println(map1.values)

    // Como adicionar novos valores
    map2["Alemanha"] = "Berlim"
    println(map2)

    // Como remover valores - Sempre informar a chave
    map2.remove("Alemanha")
    println(map2)

    // Verifica se existe o elemento
    println(map2.contains("França"))

    // Imprime o valor associada a chave
    println(map2["França"])

    // Limpando a coleção - Somente possível em mutável
    map2.clear()
}