import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import test.parameters.Data

class PortariaTest {
    @Test
    @DisplayName("Scenarios tests from portaria func")
    fun testPortaria(){
        Assertions.assertAll(
            {Assertions.assertEquals(portaria(Data().underAge,"comum", "xt"), Data().deny)},
            {Assertions.assertEquals(portaria(Data().upperAge,"", "xt"), Data().deny)},
            {Assertions.assertEquals(portaria(Data().upperAge,"VIP", "xt"), Data().deny)},
            {Assertions.assertEquals(portaria(Data().upperAge,"comum", ""), Data().deny)},
            {Assertions.assertEquals(portaria(Data().upperAge,"comum", "xt"), Data().allow)},
            {Assertions.assertEquals(portaria(Data().upperAge,"luxo", "xl"), Data().allow)},
            {Assertions.assertEquals(portaria(Data().upperAge,"comum", "aaas"), Data().deny)}
        )
    }
}