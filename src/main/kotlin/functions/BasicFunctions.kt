package functions

class BasicFunctions {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun functionWithoutReturn(): Unit {
        println("Define Unit Type to return equals a void in Java")
        println("Unit is not mandatory to declaration")
    }

    fun helloWorld() {
        println("Hello World!")
    }

    fun singleLineFunctions() {
        println("Sum 10 + 5 = ${sumSingleLine(10, 5)}")
        helloWorldSingleLine()
        println("Division single line function 75/3 = ${divisionSingleLine(75,3)}")
    }

    fun strings() = stringFunctionsFromKotlin()

    fun mathFun() = mathFunctions()

}