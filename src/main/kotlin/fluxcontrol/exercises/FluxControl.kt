package fluxcontrol.exercises

import kotlin.random.Random

fun bonusWhen(function: String): Float {
    return when (function) {
        "Manager" -> 2000f
        "Coordinator" -> 1500f
        "Software engineer" -> 1000f
        "Internal" -> 500f
        else -> 0f
    }
}
