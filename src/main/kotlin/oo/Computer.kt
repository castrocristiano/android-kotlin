package oo

class Computer(manufacturer: String) : Electronic(manufacturer) {
    fun installSoftware() {
        println("Software are installed")
    }
}