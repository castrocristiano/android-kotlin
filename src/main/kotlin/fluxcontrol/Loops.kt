package fluxcontrol

fun main() {
    iterateFor()
    iterateWhile()
    doWhile()
}

fun iterateFor() {
    for (i in 1..10)
        print("$i ")

    val str = "Kotlin is show!"

    for (char in str)
        print("$char ")

    println()

    for (i in 0..20 step 2)
        print("$i ")

    println()

    for (i in 20 downTo 0 step 2)
        print("$i ")
}

fun iterateWhile() {
    var i = 0
    val s = "Kotlin"

    while (i < 100)
        println("${i++}")

    i = 0

    while (i < s.length)
        println("${s[i++]}")

}

fun doWhile() {
    var i = 0

    do {
        println("i = ${i++}")
    } while (i < 10)

    i = 0

    println()

    while (i < 1000000000) {
        if (i == 50)
            break

        print("${i++} ")
    }

    i = 0

    println()

    while (i++ < 200) {
        if (i < 100)
            continue
        print("$i ")

    }

}