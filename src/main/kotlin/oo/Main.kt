package oo

fun main() {
    val computer = Computer("Dell")

    println(computer.manufacturer)

    println(computer.getElectricStatus())

    if (!computer.getElectricStatus())
        computer.on()

    computer.installSoftware()

    computer.off()
}