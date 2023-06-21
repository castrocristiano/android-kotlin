package classes

class Recipe {
    lateinit var instructions: String

    fun generateRecipe() {
        if (!this::instructions.isInitialized)
            instructions = "Wash hands"
    }
}