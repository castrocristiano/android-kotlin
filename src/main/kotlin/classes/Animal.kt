package classes

class Animal (var specie: String) {
    var speak: String = ""
        get() {
            println("Getting speak $field")
            return field
        }
        set(value) {
            println("Setting speak $value")
            field = value
        }
}