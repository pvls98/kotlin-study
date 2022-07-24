import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import test.parameters.Data

class PortariaTest {
    @Test
    @DisplayName("Scenarios tests from portaria func")
    fun testPortaria(){
        with(Data()) {
            Assertions.assertAll(
                { Assertions.assertEquals(portaria(underAge, "comum", "xt"), deny) },
                { Assertions.assertEquals(portaria(upperAge, "", "xt"), deny) },
                { Assertions.assertEquals(portaria(upperAge, "VIP", "xt"), deny) },
                { Assertions.assertEquals(portaria(upperAge, "comum", ""), deny) },
                { Assertions.assertEquals(portaria(upperAge, "comum", "xt"), allow) },
                { Assertions.assertEquals(portaria(upperAge, "luxo", "xl"), allow) },
                { Assertions.assertEquals(portaria(upperAge, "comum", "aaas"), deny) }
            )
        }
    }
}