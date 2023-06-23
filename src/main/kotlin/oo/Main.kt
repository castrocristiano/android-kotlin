package oo

import oo.heritage.Computer
import oo.heritage.ExampleMath

fun main() {
    callHeritageExample()

    callExampleMath()
}

private fun callHeritageExample() {
    val computer = Computer("Dell")

    println(computer.manufacturer)

    println(computer.getElectricStatus())

    if (!computer.getElectricStatus())
        computer.on()

    computer.installSoftware()

    computer.off("Goodbye!")
}

private fun callExampleMath() {
    println("PI:  ${ExampleMath.PI}")

    ExampleMath.printStatic("Static")

    println(ExampleMath.Obj1.PI)

    ExampleMath.Obj1.test()

    ExampleMath.Obj2.test()

    val e = ExampleMath("Value param")

    println(e.name)
}

