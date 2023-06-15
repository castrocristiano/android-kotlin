package fluxcontrol.exercises

/**
 * Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
 * geométrica. Informar se formam um quadrado (lados iguais).
 * 1
 * 2 Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
 * se é um triângulo equilátero (todos os lados iguais).
 * 3 Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
 * fun qualASaida(num: Int) {
 * if (num >= 0) {
 * if (num == 0)
 * println("Primeira string")
 * else println("Segunda string")
 * }
 * println("Terceira string")
 * }
 * Escreva um programa para ser usado na de portaria de um evento.
 * a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
 * permitidos.”.
 * b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
 * destes. Mensagem: “Negado. Convite inválido.”.
 * c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
 * Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
 * d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
 */


fun exercise1() {
    println("Insert the x size")
    val x = readln()
    println("Insert the y size")
    val y = readln()

    if (x.isEmpty() || y.isEmpty()) {
        println("Invalid entry.")
        return
    }

    if (x == y)
        println("Is a square")
    else
        println("Isn't a square")
}

fun exercise2() {
    println("Insert the a size")
    val a = readln()
    println("Insert the b size")
    val b = readln()
    println("Insert the c size")
    val c = readln()

    if (a.isEmpty() || b.isEmpty() || c.isEmpty()) {
        println("Invalid entry.")
        return
    }

    if (a.toInt() == b.toInt() && b.toInt() == c.toInt())
        println("Is an equilateral triangle.")
    else
        println("Isn't an equilateral triangle")

}

fun exercise3() {
    println("The answer is \"Segunda string\"")
}

fun exercise4() {
    println("Informe sua idade:")

    val age = readln()

    if (age.isNotEmpty() && age.toInt() < 18) {
        println("Negado. Menores de idade não são permitidos.")
        return
    }

    val inviteTypes = arrayOf("comum", "premium", "luxo")

    println("Informe o tipo de convite:")

    val inviteType = readln()

    if (inviteType !in inviteTypes) {
        println("Negado. Convite inválido.")
        return
    }

    println("Informe o código do convite:")

    var inviteCode = readln()

    if (inviteCode.isNotEmpty()) {
        inviteCode = inviteCode.lowercase()

        if ((inviteCode.startsWith("xt") && inviteType == "comum")
            || (inviteCode.startsWith("xl") && (inviteType == "premium" || inviteType == "luxo"))) {
            println("Welcome :)")
            return
        }
    }
    println("Negado. Convite inválido.")
}

fun main() {
    exercise1()
    exercise2()
    exercise3()
    exercise4()
}

