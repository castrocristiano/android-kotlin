package classes

class People (val birthdayYear: Int, var name: String) {
    var doc: String? = null

    constructor(birthdayYear: Int, name: String, doc: String) : this(birthdayYear, name) {
        this.doc = doc
        this.sleep()
    }

    fun sleep() {
        println("Sleep")
    }

    fun wakeUp() {
        println("Wake Up")
    }
}