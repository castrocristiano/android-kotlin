package functions

fun <T, J> averageGeneric(abc: J, str: String = "is a String with default value", vararg args: T): Float {
    var sum = 0f

    for (n in args)
        if (n is Float)
            sum += n

    if (abc is String)
        println(abc)

    println(str)

    return sum / args.size
}

fun callAverageGeneric() {
    println(averageGeneric(abc="ABC", args = arrayOf(10f, 5f, 6.5f, 7.8f)))
    println(averageGeneric("ABC", "Isn't a default String", arrayOf(10f, 5f, 6.5f, 7.8f)))
}