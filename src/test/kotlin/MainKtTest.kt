import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Tag
import kotlin.math.PI

class MainKtTest {
    val EPS = 0.000001

    @Test
    @Tag("demo")
    fun testF() {
        assertEquals(-1.0, f(PI), EPS)
        assertEquals(1.0, f(PI / 2), EPS)
        assertEquals(1.0, f(0.0), EPS)
    }

    //Additional tests:
    @Disabled
    @Test
    @Tag("var5")
    fun additionalTest1S() {
        assertEquals(7.961432, var5calcS(0.95, 12.7, 5.6), EPS)
    }

    @Disabled
    @Test
    @Tag("var5")
    fun additionalTest1Q() {
        assertEquals(-0.890869, var5calcQ(0.23, 11.2, 7.2), EPS)
    }




    @Disabled
    @Test
    @Tag("var5")
    fun testVar5calcS() {
        assertEquals(8.274287, var5calcS(0.61, 16.5, 3.4), EPS)
    }

    @Disabled
    @Test
    @Tag("var5")
    fun testVar5calcQ() {
        assertEquals(-0.000648, var5calcQ(0.61, 16.5, 3.4), EPS)
    }

}