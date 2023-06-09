import classes.callClasses
import functions.*
import introduction.ArithmeticOperators

/**
 * Function Doc
 */
fun main(args: Array<String>) {
    /*//This is a line comment
    println("Olá mundo!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    println()
    firstFunPrint()

    declareVars()

    numericTypes()

    arithmetic()

    basicFunctions()

    ifControl()

    exceptions()

    stringsElvis()

    letFunction()

    callCountXO()

    calcAverage()

    callAverageGeneric()

    callValues()*/

    callClasses()
}

fun basicFunctions() {
    val basicFunctions = BasicFunctions()

    basicFunctions.helloWorld()

    basicFunctions.functionWithoutReturn()

    println("Function sum: ${basicFunctions.sum(2,3)}")

    basicFunctions.singleLineFunctions()

    basicFunctions.strings()

    basicFunctions.mathFun()
}

private fun arithmetic() {
    val arithmeticOperators = ArithmeticOperators()

    arithmeticOperators.sum()

    arithmeticOperators.multiply()

    arithmeticOperators.division()

    arithmeticOperators.mod()
}

fun firstFunPrint() {
    println("# The comments #\n")
    println("//This is a line comment")
    println("This is a block comment: ")
    println("/**\n  * the comment text \n  */ ")

}