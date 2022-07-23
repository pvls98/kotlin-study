import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PortariaTest {
    @Test
    @DisplayName("Scenarios tests from portaria func")
    fun testPortaria(){
        Assertions.assertAll(
            {Assertions.assertEquals(portaria(15,"comum", "xt"), "Negado.")},
            {Assertions.assertEquals(portaria(19,"", "xt"), "Negado.")},
            {Assertions.assertEquals(portaria(20,"VIP", "xt"), "Negado.")},
            {Assertions.assertEquals(portaria(20,"comum", ""), "Negado.")},
            {Assertions.assertEquals(portaria(20,"comum", "xt"), "Welcome.")},
            {Assertions.assertEquals(portaria(18,"luxo", "xl"), "Welcome.")},
            {Assertions.assertEquals(portaria(20,"comum", "aaas"), "Negado.")}
        )
    }
}