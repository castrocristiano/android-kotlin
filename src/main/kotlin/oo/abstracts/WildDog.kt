package oo.abstracts

class WildDog(name: String, override var test: String) : Animal(name), Wild  {
    override fun speak() {
       println("Grrrrrrrrrrrrrrrr")
    }

    override fun attack() {
        println("Arggggggggg")
    }
}