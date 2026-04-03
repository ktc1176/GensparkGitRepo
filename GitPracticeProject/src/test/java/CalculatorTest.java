import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    
    // Tests for default constructor
    @Test
    public void testDefaultConstructor() {
        assertEquals(0, calculator.getNum1());
        assertEquals(0, calculator.getNum2());
    }
    
    // Tests for parameterized constructor
    @Test
    public void testParameterizedConstructor() {
        Calculator calc = new Calculator(5, 3);
        assertEquals(5, calc.getNum1());
        assertEquals(3, calc.getNum2());
    }
    
    @Test
    public void testParameterizedConstructorWithNegativeNumbers() {
        Calculator calc = new Calculator(-5, -3);
        assertEquals(-5, calc.getNum1());
        assertEquals(-3, calc.getNum2());
    }
    
    // Tests for setters
    @Test
    public void testSetNum1() {
        calculator.setNum1(10);
        assertEquals(10, calculator.getNum1());
    }
    
    @Test
    public void testSetNum2() {
        calculator.setNum2(20);
        assertEquals(20, calculator.getNum2());
    }
    
    @Test
    public void testSetNegativeNum1() {
        calculator.setNum1(-15);
        assertEquals(-15, calculator.getNum1());
    }
    
    @Test
    public void testSetNegativeNum2() {
        calculator.setNum2(-25);
        assertEquals(-25, calculator.getNum2());
    }
    
    // Tests for add function
    @Test
    public void testAddPositiveNumbers() {
        calculator.setNum1(5);
        calculator.setNum2(3);
        assertEquals(8, calculator.add());
    }
    
    @Test
    public void testAddNegativeNumbers() {
        calculator.setNum1(-5);
        calculator.setNum2(-3);
        assertEquals(-8, calculator.add());
    }
    
    @Test
    public void testAddMixedNumbers() {
        calculator.setNum1(10);
        calculator.setNum2(-7);
        assertEquals(3, calculator.add());
    }
    
    @Test
    public void testAddZero() {
        calculator.setNum1(0);
        calculator.setNum2(0);
        assertEquals(0, calculator.add());
    }
    
    @Test
    public void testAddWithZero() {
        calculator.setNum1(5);
        calculator.setNum2(0);
        assertEquals(5, calculator.add());
    }
    
    // Tests for subtract function
    @Test
    public void testSubtractPositiveNumbers() {
        calculator.setNum1(10);
        calculator.setNum2(3);
        assertEquals(7, calculator.subtract());
    }
    
    @Test
    public void testSubtractNegativeNumbers() {
        calculator.setNum1(-10);
        calculator.setNum2(-3);
        assertEquals(-7, calculator.subtract());
    }
    
    @Test
    public void testSubtractMixedNumbers() {
        calculator.setNum1(10);
        calculator.setNum2(-5);
        assertEquals(15, calculator.subtract());
    }
    
    @Test
    public void testSubtractZero() {
        calculator.setNum1(0);
        calculator.setNum2(0);
        assertEquals(0, calculator.subtract());
    }
    
    @Test
    public void testSubtractWithZero() {
        calculator.setNum1(5);
        calculator.setNum2(0);
        assertEquals(5, calculator.subtract());
    }
    
    @Test
    public void testSubtractResultingInNegative() {
        calculator.setNum1(3);
        calculator.setNum2(10);
        assertEquals(-7, calculator.subtract());
    }
}
