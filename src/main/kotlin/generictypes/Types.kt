package generictypes

fun values(value: Any): Unit {
    println(value)
}

fun nothingValues(value: Any): Nothing {
    TODO("Not yet implemented")
}

fun callValues() {
    values("A String value")
    values(1f)
    values(false)
    try {
        nothingValues("Nothing")
    } catch (e: NotImplementedError) {
        println(e.message)
    }
}