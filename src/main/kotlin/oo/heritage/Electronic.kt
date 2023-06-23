package oo.heritage


open class Electronic(var manufacturer: String) {
     private var isOn: Boolean = false

    fun getElectricStatus(): Boolean = isOn

    fun on() {
        if (!isOn)
            isOn = true
        println("Electronic is on")
    }

    open fun off() {
        if (isOn)
            isOn = false
        println("Electronic is off")
    }


}