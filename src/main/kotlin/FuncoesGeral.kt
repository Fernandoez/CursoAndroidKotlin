fun main() {
    println("${helloWorld("Kotlin")}")   //chamada da funcao
    helloWorld2()
    helloWord3()
    println("${sum(10, 5)}")
    println("${divisao(10f, 5.5f)}")
}

//"fun" indica uma funcao
//o nome vem em seguida (helloworld)
//pode ou não ter parametros, nesse caso nome (obrigatoriamente tem que ser informado o tipo)
//e pode ou não ter retorno (toda funcao com retorno obrigatoriamente precisa ter return)
fun helloWorld(nome: String): String {
    return "Olá, $nome!"
}

fun helloWorld2() {
    println("Ola mundo!")
}

fun sum(a: Int, b: Int): Int {
    return (a + b)
}

//Funcoes em uma unica linha
fun helloWord3() = println("Ola Mundo em uma linha")

fun sum2(a: Int, b: Int): Int = (a + b) //Posso enxugar mais tirando o ": Int" do retorno

fun divisao(a: Float, b: Float) = a / b

/*Tipos diferentes de retornos
        Unit -> diz que a funcao nao possui retorno (semelhante com void e pode ser omitido)
        Instancias de classes -> nossos prorpios tipos
*/