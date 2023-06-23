package oo

class Computer(manufacturer: String) : Electronic(manufacturer) {
    fun installSoftware() {
        println("Software are installed")
    }

    override fun off() {
        println("It's override")
        super.off()
    }

    fun off(message: String) {
        println(message)
        this.off()
    }
}