fun main() {

    //Conceito de null safety -> Funcinaludade/Propriedade do Kotlin que tenta previnir erros nas variáveis que podem ser nulas
    //Por padrão o kotlin trabalha com variáveis não nulas.
    // var s: String = null -> Não será aceito

    // Porém elas, em algum momento, podem sim receber o valor "null"
    //Ao adicionar a "?" no tipo da minha variável ele permite a atribuição de valor nulo. Deixamos explícito que a variável pode ser nula
    var s: String? = null
    // A partir desse momento, o uso da varíavel requer "?" antes de acessar uma propriedade
    println(s?.length) //para me permitir chamar a variavel com o valor nulo, preciso tbm adicionar o "?"

    //O "?" é usado para que o kotlin trate como null a variável e não pare a execução do programa
        //Quando não temos certeza de que a var não será nula
    //O "!!" é usado para que o kotlin entenda que vamos tratar o valor null da var
        //Quando termos certeza que o valor da var não será nulo. E caso seja nula nós assumimos o problema

    //Essa chamada por si só, gera o famoso erro "NullPointerException" porque o Kotlin não irá tratar o nulo
    println(s!!.length)
}