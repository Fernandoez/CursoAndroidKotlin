package pOO
/*
 * Herança é uma funcionalidade em orientação a objetos que permite fazer a especialização de classes.
 * A classe Maquina é a classe superior de Computador.
 * A classe Computador é a especialização de Maquina, possuindo um atributo a mais.
 * Uma classe especializada possui os mesmo atributos e métodos (não privados) e pode definir novos.
 *
 * Para que uma classe possa ser herdada, é necessário o uso da palavra 'open'.
 */
fun main() {

    val comp = Computador("DELL", 4000f)
    comp.minhaMarca()
    comp.preco
    comp.ligar()        //funcao herdade de maquina
    comp.desligar()
    comp.processar()   //funcao especifica da classe computador

    // Não acessível, nem se fosse instanciado uma val do tipo direto Maquina
    // comp.somenteMaquina()
}

// Classe base
//open na frente para indicar que é uma classe aberta e pode ser herdada
open class Maquina(val marca: String) {

    fun ligar(){}
    fun desligar(){}

    fun minhaMarca() {
        println("Sou da marca: $marca")
    }

    //não pode ser enxergada fora do escopo da classe
    private fun somenteMaquina() {
        println("Esse método é acessível somente por instâncias da classe Maquina.")
    }
}

// Classe especializada -> nomenclatura para herdar. Tem que possuir o parametro passado nos parenteses e na indicação de herança (onde tem a palavra marca)
// E podem ser definidos mais parametros, especificos dessa classe
class Computador(marca: String, val preco: Float) : Maquina(marca){
    fun processar(){}

}