package POO

/*
 * Classes enum permitem a definição de uma lista de valores dentro da classe.
 * Útil quando é necessário transitar um intervalo de valores conhecidos,
 * pois restringe as possibilidades e os erros.
 */
fun main() {

    // Por exemplo, uma classe que contenha os meses do ano.
    // Ou uma classe que tenha os dias da semana

    // Percorre a lista de valores
    for (p in Prioridade.values()) {
        println(p)
    }

    // Valor associado a prioridade
    println(Prioridade2.ALTA.id)

}

enum class Prioridade {
    BAIXA {
        override fun toString(): String {
            return "Essa prioridade é baixa."
        }
    },
    MEDIA, ALTA
}

enum class Prioridade2(val id: Int) {
    BAIXA(1), MEDIA(5), ALTA(10)
}