import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private CalculatorService calculatorService;

    @Test
    public void ifAddWorks() {
        calculatorService = new CalculatorServiceImpl();
        assertEquals(11, calculatorService.sum(5, 6));
    }

    @Test
    public void ifMultiplyWorks() {
        calculatorService = new CalculatorServiceImpl();
        assertEquals(30, calculatorService.prod(5, 6));
    }
}
