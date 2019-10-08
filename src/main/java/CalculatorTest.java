import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void add(){
        Calculator calculator = new Calculator(3, 2, 8.8, 2.2);
        assertEquals(5, calculator.add());
    }

    @Test
    public void subtract(){
        Calculator calculator = new Calculator(3, 2, 8.8, 2.2);
        assertEquals(1, calculator.subtract());
    }

    @Test
    public void multiply(){
        Calculator calculator = new Calculator(3, 2, 8.8, 2.2);
        assertEquals(6, calculator.multiply());
    }

    @Test
    public void divide(){
        Calculator calculator = new Calculator(3, 2, 8.8, 2.2);
        assertEquals( 4, calculator.divide(), 0.01 );
    }

}
