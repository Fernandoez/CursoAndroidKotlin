package POO
/*
 * A classe abstrata define alguns comportamentos que as classes que herdam devem ter. Serão implementados nessas classes
 * Uma classe abstrata não pode ser instanciada, é usada para moldar classes que herdam seu comportamento.
 */
fun main() {
    val cachorro = Cachorro("Bolt")
    cachorro.falar()
    cachorro.nome()
}

//Pode ser herdade sem o open (o open, inclusive, não deve ser colocado)
//Uma classe abstrata deve ter no mínimo um método abstrato. Assim, podem existir métodos já implementados.
abstract class Mamifero(val nome: String) {
    private var peso = 0f

    abstract fun falar()
    open fun nome() {
        println("Sou um mamífero: $nome")
    }
}

//Herda de mamífero
class Cachorro(especie: String) : Mamifero(especie) {

//Implementa obrigatoriamente a função definida como abstrata na classe pai.
    override fun falar() {
        println("Au au")
    }

//Não precisa implementar métodos que não são definidos como abstratos, mas poderia com o uso do override.
    override fun nome() {
        super.nome()
    }
}