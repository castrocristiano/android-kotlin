package functions

fun stringsElvis() {
    println("Insert a text")

//    val str: String? = readlnOrNull()

    val str: String? = null

    if (str == null)
        println("str is null")
    else
        println(str)

    println("The same thing with Elvis Operator:")

    println(str ?: "str is null")
}