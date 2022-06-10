package pOO
/*
Bloco de instruções que é executado assim que a classe é instânciada e o construtor é executado.
Posso ter mais do que um Init e todos serão execudados pela ordem do código
*/
fun main() {
    val nina = Animal("Cachorro")
}

class Animal(val especie: String) {
    var fala: String = ""

    init {
        fala = if (especie.lowercase() == "cachorro") {
            "au au"
        } else if (especie.lowercase() == "gato") {
            "miau"
        } else {
            ""
        }
    }

    init {
        println(fala)
    }

}