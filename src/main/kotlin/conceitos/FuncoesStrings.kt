fun main() {
    val str = "Programação Kotlin"

    println("Tamanho da String: ${str.length}")
    println("Posicao 0 da String: ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))
    println(str.substring(2, 5))
    println(str.replace("Kotlin", "Kotlin é show!"))
    println(str.lowercase())
    println(str.uppercase())
    println("           Eliminando espaços em branco     inicio e fim apenas           ".trim())

}