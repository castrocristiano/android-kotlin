package oo


open class Electronic(var manufacturer: String) {
     private var isOn: Boolean = false

    fun on() {
        if (!isOn)
            isOn = true
        println("Is on")
    }

    fun off() {
        if (isOn)
            isOn = false
        println("Is off")
    }


}