package functions

fun letFunction() {
    val str = "ABCdef"

    println(str)

    str.let {
        //scope function
        //The var it references str
        println(it.lowercase())
    }

}