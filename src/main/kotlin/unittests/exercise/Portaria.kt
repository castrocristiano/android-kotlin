package unittests.exercise

const val NEGADO_ = "Negado."

const val COMUM = "comum"

const val PREMIUM = "premium"

const val LUXO = "luxo"

const val WELCOME_ = "Welcome."

const val XT = "xt"

const val XL = "xl"

fun portaria(idade: Int, tpConvite: String, cod: String): String {
    if (idade < 18) {
        return NEGADO_
    }

    if (tpConvite != "") {
        val tipoConvite = tpConvite.lowercase()

        if (tipoConvite != COMUM && tipoConvite != PREMIUM && tipoConvite != LUXO) {
            return NEGADO_
        }

        if (cod != "") {
            val codigo = cod.lowercase()
            return if (tipoConvite == COMUM && codigo.startsWith(XT)) {
                WELCOME_
            } else if ((tipoConvite == PREMIUM || tipoConvite == LUXO) && codigo.startsWith(XL)) {
                WELCOME_
            } else {
                NEGADO_
            }
        }
    }
    return NEGADO_
}