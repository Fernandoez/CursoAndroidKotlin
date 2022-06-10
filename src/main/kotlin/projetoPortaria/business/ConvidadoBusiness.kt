package projetoPortaria.business

import projetoPortaria.entity.Convidado

class ConvidadoBusiness {

    fun maiorDeIdade(idade: Int) = (idade >= 18)

    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun incialValida(convidado: Convidado) = when (convidado.tipo) {
        "comum" -> convidado.codigo.startsWith("xt")
        "premium", "luxo" -> convidado.codigo.startsWith("xl")
        else -> false
    }
}