package calculator;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorModellTest {

    // TODO - instance from Calculator

    @Test
    public void testTheAddition() {
        assertEquals(20, CalculatorModell.addition(10,10));
        assertEquals(21, CalculatorModell.addition(10.5,10.5));
        assertEquals(20.5, CalculatorModell.addition(10,10.5));
        assertEquals(20.5, CalculatorModell.addition(10.5,10));
    }

    @Test
    public void testTheSubtraction() {
        assertEquals(10, CalculatorModell.subtraction(20,10));
        assertEquals(9.5, CalculatorModell.subtraction(20,10.5));
        assertEquals(10.5, CalculatorModell.subtraction(20.5,10));
        assertEquals(10, CalculatorModell.subtraction(20.5,10.5));
    }

    @Test
    public void testTheMultiplication() {
        assertEquals(25, CalculatorModell.multiplication(5,5));
        assertEquals(28.6, CalculatorModell.multiplication(5.5,5.2));
        assertEquals(27.5, CalculatorModell.multiplication(5,5.5));
        assertEquals(27.5, CalculatorModell.multiplication(5.5,5));
    }

    @Test
    public void testTheDivision() {
        assertEquals(1, CalculatorModell.division(10,10));
        assertEquals(3, CalculatorModell.division(10.5,3.5));
        assertEquals(3.5, CalculatorModell.division(10.5,2));
        assertEquals(4, CalculatorModell.division(10,2.5));
    }

    @Test
    public void testTheExponentation() {
        assertEquals(100, CalculatorModell.exponentation(10,2));
        assertEquals(165.546, CalculatorModell.exponentation(10.2,2.2));
        assertEquals(104.04, CalculatorModell.exponentation(10.2,2));
        assertEquals(4.54, CalculatorModell.exponentation(10,2.2));
    }

    @Test
    public void testTheRoot() {
        assertEquals(3, CalculatorModell.root(9,2));
        assertEquals(2.46, CalculatorModell.root(9.5,2.5));
        assertEquals(3.03, CalculatorModell.root(9.2,2));
        assertEquals(18.9, CalculatorModell.root(9,2.1));
    }



}