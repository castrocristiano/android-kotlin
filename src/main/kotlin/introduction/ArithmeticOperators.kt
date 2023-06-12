package introduction;

class ArithmeticOperators {

    fun sum() {
        println("Sum operators \"=+\"")
        var age = 34
        println("Age is $age")
        age += 1
        println("After increment by 1, age is $age")
        println("Age is 'age++' ${age++}")
        println("Age is ${age}")
        println("Age is '++age' ${++age}")
        println("Classic attribution: ")
        age = age + 1
        println("Age is $age. IDE is crying...")
    }

    fun multiply() {
        println("multiply")
        var sticks = 34
        println("Age is $sticks")
        sticks = sticks * 2
        println("After  'sticks = sticks * 2': $sticks")
        sticks *= 2
        println("Simplify  'sticks *= 2': $sticks")
    }

    fun division() {
        var pieces: Float = 50f
        pieces = pieces / 2
        println("Pieces divided by 2 is $pieces")
        pieces /= 2
        println("Simplify division: Pieces divided by 2 is $pieces")
    }

    fun mod() {
        println("10 / 3f = ${10 / 3f}")
        println("10 / 3 = ${10 / 3}")
        println("mod 10 % 3 = ${10 % 3f}")
    }
}