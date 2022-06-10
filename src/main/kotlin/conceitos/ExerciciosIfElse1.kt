/*
1 - Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
do ano. Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00

2 - Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00
*/

fun main() {
    val bonus = calculaBonus("Coordenador", 1)
    if (bonus == 0f)
        println("Cargo incorreto")
    else
        println(bonus)
}

fun calculaBonus(cargo: String, exp: Int): Float {
    var vrBonus: Float = 0f
    if (cargo.lowercase() == "gerente") {
        if (exp < 2) {
            vrBonus = 2000f
        } else {
            vrBonus = 3000f
        }
    } else if (cargo.lowercase() == "coordenador") {
        if (exp < 1) {
            vrBonus = 1500f
        } else {
            vrBonus = 1800f
        }
    } else if (cargo.lowercase() == "engenheiro") {
        vrBonus = 1000f
    } else if (cargo.lowercase() == "estagiario") {
        vrBonus = 500f
    }
    return vrBonus
}

fun calculaBonusWhen(cargo: String): Float {
    var bonus: Float = 0f
    when (cargo) {
        "Gerente" -> {
            bonus = 2000f
        }
        "Coordenador" -> {
            bonus = 1500f
        }                   //quando possui somente uma instrução não é necessário uso de {}
        "Engenheiro" -> bonus = 1000f
        "Estagiario" -> bonus = 500f
    }

    /*Outra forma de fazer  .: Deve-se considerar cair em algumas das situações do when, por isso colocamos o "else" dentro do when
    val bonus = when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
    */
    return bonus

    /*Ou ainda
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
    */
}