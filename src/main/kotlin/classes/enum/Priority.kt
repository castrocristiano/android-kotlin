package classes.enum

enum class Priority(val code: Int) {
    LOW(2) {
        override fun toString(): String {
            return "$code - LOWER"
        }
    },
    MID(1), HIGH(0)
}