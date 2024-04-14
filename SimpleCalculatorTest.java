import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    public void testAdd() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        SimpleCalculator calculator = new SimpleCa
lculator();
        assertEquals(2, calculator.subtract(5, 3));
    }
}