package fluxcontrol.exercises

import kotlin.random.Random

fun bonusWhen(function: String): Float {
    return when (function) {
        "Manager" -> 2000f
        "Coordinator" -> 1500f
        "Software engineer" -> 1000f
        "Internal" -> 500f
        else -> 0f
    }
}


fun ifControl() {
    val num = 30

    if (num > 20)
        println("Number is great than 20")
}

/**
 * Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
 * do ano. Os bônus são classificados por cargo.
 * a. Gerentes recebem R$ 2.000,00
 * b. Coordenadores recebem R$ 1.500,00
 * c. Engenheiros de software recebem R$ 1.000,00
 * d. Estagiários recebem R$ 500,00
 */
fun bonus(function: String): Float {
    return if (function.equals("Manager", true))
        2000f
    else if (function.equals("Coordinator", true))
        1500f
    else if (function.equals("Software engineer", true))
        1000f
    else if (function.equals("Internal", true))
        500f
    else
        0f
}

/**
 * Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
 * a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
 * b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
 * c. Engenheiros de software recebem R$ 1.000,00
 * d. Estagiários recebem R$ 500,00
 */
fun bonusPerExperienceTime(function: String, experience: Int): Float {
    var bonus = 0f
    if (function.equals("Manager", true))
        bonus = if (experience < 2)
            2000f
        else
            3000f
    else if (function.equals("Coordinator", true))
        bonus = if (experience < 1)
            1500f
        else
            1800f
    else if (function.equals("Software engineer", true))
        bonus = 1000f
    else if (function.equals("Internal", true))
        bonus = 500f
    return bonus
}

fun main() {
    println(bonus("Manager"))
    println(bonus("Software engineer"))
    println(bonus("Coordinator"))
    println(bonus("Internal"))
    println(bonusPerExperienceTime("Manager", 2))
    println(bonusPerExperienceTime("Internal", 0))

    println("Manager: ${bonusWhen("Manager")}")
    println("Software engineer: ${bonusWhen("Software engineer")}")
    println("Coordinator: ${bonusWhen("Coordinator")}")
    println("Internal: ${bonusWhen("Internal")}")
    println("Little Joe: ${bonusWhen("Little Joe")}")

}