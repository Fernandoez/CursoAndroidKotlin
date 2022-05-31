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

