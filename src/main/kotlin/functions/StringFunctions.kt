package functions

fun stringFunctionsFromKotlin() {
    val str = "Kotlin with beer"

    println("My String is '$str'")

    println("String length = ${str.length}")

    println("Zero position: ${str[0]}")

    println("Starts with 'Ko': ${str.startsWith("Ko")}")

    println("Starts with 'Ko' ignore case: ${str.startsWith("ko", true)}")

    println("Ends with 'abc': ${str.endsWith("abc")}")

    println("Substring: ${str.substring(2, 4)}")

    println(str.replace("beer", "tea"))

    println(str.lowercase())

    println(str.uppercase())

    val newStr = "             My name is Cristiano       "

    println("'$newStr'")

    println("'${newStr.trim()}'")
}