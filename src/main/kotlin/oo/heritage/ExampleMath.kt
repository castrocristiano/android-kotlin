package oo.heritage

class ExampleMath(var name: String) {
    init {
        println("ExampleMath initialized")
    }

    companion object MATH {
        val PI = 3.1415

        fun printStatic(message: String) {
            println(message)
        }
    }

    object Obj1 {
        val PI = 3.1415

        init {
            println("Obj1 initialized")
        }

        fun test() {
            println("Fun obj1")
        }
    }

    object Obj2 {
        val PI = 3.1415

        init {
            println("Obj2 initialized")
        }

        fun test() {
            println("Fun obj2")
        }
    }

}