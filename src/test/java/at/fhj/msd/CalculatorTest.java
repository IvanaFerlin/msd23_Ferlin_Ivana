package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @DisplayName("Testing add() method")
    @Test
    void testAdd(){
        assertEquals(15.7, calculator.add(10.5,5.2));
    }

    @DisplayName("Testing minus() method")
    @Test
    void testMinus(){
        assertEquals(5.3, calculator.minus(10.5,5.2));
    }

    @DisplayName("Testing divide() method")
    @Test
    void testdivide(){
        assertEquals(2.1, calculator.divide(10.5,5));
    }

    @DisplayName("Testing multiply() method")
    @Test
    void testMultiply(){
        assertEquals(54.6, calculator.multiply(10.5,5.2));
    }




    @DisplayName("Testing factorial() method")
    @Test
    void testFactorial() {
        assertEquals(6, calculator.factorial(3));
        assertEquals(1, calculator.factorial(0));
        assertEquals(0, calculator.factorial(-3));
    }


    @DisplayName("Testing divide 0 method")
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
    }


}
