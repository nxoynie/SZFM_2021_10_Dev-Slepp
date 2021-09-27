package calculator;
package calc;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorModelTest {


    CalculatorModel c = new CalculatorModel();

    @Test
    public void testTheAddition() {
        assertEquals(20, c.addition(10,10));
        assertEquals(21.0, c.addition(10.5,10.5),2);
        assertEquals(20.5, c.addition(10,10.5),2);
        assertEquals(20.5, c.addition(10.5,10),2);
    }

    @Test
    public void testTheSubtraction() {
        assertEquals(10, c.subtraction(20,10));
        assertEquals(9.5, c.subtraction(20,10.5),2);
        assertEquals(10.5, c.subtraction(20.5,10),2);
        assertEquals(10, c.subtraction(20.5,10.5),2);
    }

    @Test
    public void testTheMultiplication() {
        assertEquals(25, c.multiplication(5,5));
        assertEquals(28.6, c.multiplication(5.5,5.2),2);
        assertEquals(27.5, c.multiplication(5,5.5),2);
        assertEquals(27.5, c.multiplication(5.5,5),2);
    }

    @Test
    public void testTheDivision() {
        assertEquals(1, c.division(10,10),2);
        assertEquals(3, c.division(10.5,3.5),2);
        assertEquals(3.5, c.division(10.5,2),2);
        assertEquals(4, c.division(10,2.5),2);
    }

    @Test
    public void testTheExponentation() {
        assertEquals(100, c.exponentation(10,2),2);
        assertEquals(165.546, c.exponentation(10.2,2.2),2);
        assertEquals(104.04, c.exponentation(10.2,2),2);
        assertEquals(158.48, c.exponentation(10,2.2),3);
    }

    @Test
    public void testTheRoot() {
        assertEquals(3, c.root(9,2),2);
        assertEquals(2.46, c.root(9.5,2.5),2);
    }



}