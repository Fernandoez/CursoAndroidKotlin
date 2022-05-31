/**
 * comentário que serve como documentação (inicia com "barra"** e dou enter)
 */
fun main() {
    println("Hello, World!") //comentário
    /* comentário de várias linhas*/

    //Variaveis
    var nome1: String = "Fernando"
    var c: Char = 'F'
    var b: Boolean = true
    var double: Double = 10.0
    var float: Float = 10.0f   //forçando a ser float
    var long: Long = 10L      // forçando a ser long
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10

    var idade2: Int
    var idade3 = 10
    var idade4: Byte = 10

    //Variaveis imutáveis
    val var1: String = "Fernando"

    //Tipos
    /*Type      Bit
    * Double    64
    * Float     32
    * Long      64
    * Int       32
    * Short     16
    * Byte      8
    * Boolean   ?
    * String    ? gera o armazenamento necessário de acordo com o tamanho da informação
    * Char      ?*/

    /*Tipos Unsigned (numeros não negativos -- Somente para os tipos de números que são inteiros)
    * UInt, UShort, UByte, ULong*/
    var abc: UInt = 0u
    var abcd: UShort = 10u

    //Formatação de Strings
    val nome = "Tony"
    val sobrenome = "Stark"

    print("Olá, $nome $sobrenome") //interpolação
    print("Double: ${Double.MAX_VALUE}")

    //var concat: String = nome + " " + sobrenome -> Concatenação pode ser atribuída como abaixo
    var concat: String = "$nome $sobrenome"
    print(concat)

    //operadores aritimeticos +, -, *, /, %
    var idade = 30
    idade += 5
    idade++ //primeiro usa depois incrementa
    ++idade //incrementa depois usa
    idade--
    --idade
}