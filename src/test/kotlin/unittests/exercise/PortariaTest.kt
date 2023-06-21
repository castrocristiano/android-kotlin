package unittests.exercise

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PortariaTest {
    @Test
    fun testPortariaNegadoByAge() {
        Assertions.assertAll(
            { assertEquals(portaria(0, "", ""), NEGADO_) },
            { assertEquals(portaria(17, "", ""), NEGADO_) },
            { assertEquals(portaria(19, "", ""), NEGADO_) },
            { assertEquals(portaria(19, "NOT PREMIUM", ""), NEGADO_) },
            { assertEquals(portaria(19, PREMIUM, "XV654s4asdqweq"), NEGADO_) }
        )

    }

    @Test
    fun testPortariaNegadoByTpConvite() {
        assertEquals(portaria(19, PREMIUM, ""), NEGADO_)
        assertEquals(portaria(19, COMUM, ""), NEGADO_)
        assertEquals(portaria(19, LUXO, ""), NEGADO_)
    }

    @Test
    fun testPortariaWelcome() {
        assertEquals(portaria(19, PREMIUM, XL), WELCOME_)
        assertEquals(portaria(19, COMUM, XT), WELCOME_)
        assertEquals(portaria(19, LUXO, XL), WELCOME_)
    }
}