package functions.exercises

import kotlin.math.pow

/*
Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
minutos e segundos. Saída desejada:
2 anos equivalem a:
24 meses
730 dias
17520 horas
1051200 minutos
63072000 segundos
1
2 Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
3 Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
4 Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).

Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
b. Escrever uma função para a troca de letras e impressão do valor final.
c. String final deve estar com todas as letras minúsculas.
5
Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se
sim, transforme-as.
 */

fun years(years: UShort) {
    val months: UShort = 12u

    val days: UShort = 365u

    val hoursPerDay: UShort = 24u

    val hours = days * hoursPerDay

    val minutes = hours * 60u

    val seconds = minutes * 60u

    println("$years is equivalent to:")

    println("${years * months} months")

    println("${years * days} days")

    println("${years * hours} hours")

    println("${years * minutes} minutes")

    println("${years * seconds} seconds")
}

fun stringSize(str: String) = str.length

fun cubeCalc(num: Double) = num.pow(3)

fun toKm(miles: Double) = miles * 1.6

fun replaceString(str: String) {
    val finalStr = str.replace("A", "x", true)
    println(finalStr.lowercase())
}

fun main() {
    years(2u)

    val str = "ABC"
    println("\"$str\" size is ${stringSize(str)}")

    val num = 2.0
    println("num ^3 is ${cubeCalc(num)}")

    println("$num mile(s) is ${toKm(num)}km")

    replaceString("Apple is a great fruit. Very delicious!")
}