fun main() {
    media(12f, 8f, 4f, 97.3f)
}

// Usando vararg em um parâmetro de função, indico que não existe limite para a quantidade de parâmetros.
//A função aceita quantos eu quiser passar e trabalha em cima da quantidade passada
//A chamada pode ser verificada na main
fun media(vararg notas: Float) {
    var soma = 0f
    for (i in notas) {
        soma += i
    }
    println("Média: ${soma / notas.size}")  //notas.size me retorna o tamanho/quantidade de parâmetros que eu passei
}

// Aceita qualquer tipo de parâmetro com quantidade ilimitada.
//Posso declarar mais do que um tipo genérico ex: <T, J>
//Posso usar outros parâmetros junto com vararg, prém, sempre deixar o vararg por último ex:
// fun <T, J> generico(param1: T, vararg params: J)
//Posso usar a palavra "is" para perguntar se um elemento É de algum tipo: if (p is Int)
fun <T> generico(vararg params: T) {
    println("Existem ${params.size} parâmetros!")

    // Percorre a lista
    for (p in params) {
        // Verifica o tipo dos parâmetros recebidos
        when (p) {
            is String -> {
            }
            is Int -> {
            }
            is Float -> {
            }
        }
    }

}