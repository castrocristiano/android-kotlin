package oo.abstracts

abstract class Animal (val name: String){
     fun wake() {
         println("Wake up")
     }

    fun sleep() {
        println("ZzzzZZzz")
    }

    abstract fun speak()

}