package functions

fun average(vararg notes: Float): Float {
    var sum = 0f

    for (n in notes)
        sum += n

    return sum / notes.size
}

fun calcAverage() {
    println(average(10f, 5f, 6.5f, 7.8f))
    println(average(10f, 7.8f))
}