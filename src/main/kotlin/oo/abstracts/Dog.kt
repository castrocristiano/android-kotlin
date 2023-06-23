package oo.abstracts

class Dog (name: String) : Animal(name) {
    override fun speak() {
        println("Woof!")
    }

}