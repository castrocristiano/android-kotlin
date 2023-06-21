package functions

import functions.countXO
import functions.exceptionMethod
import org.junit.jupiter.api.*

class CountTest {
    @Test
    @DisplayName("Test testCountXO xxOo")
    fun testCountXO() {

        Assertions.assertEquals(countXO("xxOo"), true)
        Assertions.assertFalse(countXO("xxOox"))
        Assertions.assertFalse(countXO("xxO"))
        Assertions.assertFalse(countXO("abc"))

        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxOo")) },
            { Assertions.assertEquals(countXO("xxOo"), true) },
            { Assertions.assertFalse(countXO("xxO")) }
        )
    }

    @Test
    @Disabled
    @DisplayName("Test testCountXO xxOo DISABLED")
    fun disabledTestCountXO() {

        Assertions.assertEquals(countXO("xxOo"), true)
        Assertions.assertFalse(countXO("xxOox"))
        Assertions.assertFalse(countXO("xxO"))
        Assertions.assertFalse(countXO("abc"))

        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxOo")) },
            { Assertions.assertEquals(countXO("xxOo"), true) },
            { Assertions.assertFalse(countXO("xxO")) }
        )
    }

    @Test
    @Disabled
    fun mustFail() {
        fail("Implements this test!")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxo"))

        Assertions.assertTrue(countXO("xxoo"))
    }

    @Test
    fun exceptionTest() {
        assertThrows<NullPointerException> { exceptionMethod() }
    }

}