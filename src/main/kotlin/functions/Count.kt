package functions

fun countXO(str: String): Boolean {
    val strLower = str.lowercase()

    var i = 0
    var countX = 0
    var countO = 0

    while (i < strLower.length) {
        if (strLower[i] == 'x')
            countX++
        else if (strLower[i] == 'o')
            countO++
        i++
    }

    return countO == countX && countO != 0
}

fun callCountXO() {
    /*println("Insert a text")

    val input = readln()

    println(countXO(input))*/

    println(countXO("xxXxabcOoOo"))
    println(countXO("xxXxabcOoOoO"))
    println(countXO("abcOoOoO"))
    println(countXO("xxXxabc"))
}

fun exceptionMethod() {
    throw NullPointerException("A null pointer exception is thrown!")
}