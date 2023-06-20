package exceptions

import java.lang.RuntimeException

fun exampleNullSafe() {
    var s: String? = null

    println(s?.length)

    println("'println(s!!.length)' it's try get length without check null.")


    println("Insert a text.")

    s = readLine()

    println(s?.length)
}

fun exceptionsTreatment(option: Int?) {
    var s: String? = null

    try {
        when (option) {
            1 -> print(s!!.length)
            2 -> 10 / 0
            3 -> {
                println("Throw a new exception")
                throw RuntimeException()
            } else -> {
                println("Invalid Option $option")
                return
            }
        }
    } catch (ex: NullPointerException) {
        println("s is null!")
    } catch (ae: ArithmeticException) {
        println("Not possible division by zero!")
    } catch (e: Exception) {
        println("A generic exception.")
    } finally {
        println("Finally, the end!")
    }
}

fun exceptions() {
//    exampleNullSafe()
    println("Insert a option to treat a exception: 1 = nullPointer, 2 = division by zero or 3 = generic exception")
    val option = readLine()
    exceptionsTreatment(option?.toInt())
}

