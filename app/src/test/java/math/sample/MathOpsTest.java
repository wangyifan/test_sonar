package math.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MathOpsTest {
    @Test
    void testAddPositiveNumbers() {
        assertEquals(5, MathOps.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, MathOps.add(-2, -3));
    }

    @Test
    void testAddZero() {
        assertEquals(2, MathOps.add(2, 0));
        assertEquals(0, MathOps.add(0, 0));
    }

    @Test
    void testMultiplyPositiveNumbers() {
        assertEquals(6, MathOps.multiply(2, 3));
    }

    @Test
    void testMultiplyNegativeNumbers() {
        assertEquals(6, MathOps.multiply(-2, -3));
        assertEquals(-6, MathOps.multiply(-2, 3));
        assertEquals(-6, MathOps.multiply(2, -3));
    }

    @Test
    void testMultiplyByZero() {
        assertEquals(0, MathOps.multiply(0, 5));
        assertEquals(0, MathOps.multiply(5, 0));
        assertEquals(0, MathOps.multiply(0, 0));
    }

    @Test
    void testDividePositiveNumbers() {
        assertEquals(2, MathOps.divide(6, 3));
    }

    @Test
    void testDivideNegativeNumbers() {
        assertEquals(2, MathOps.divide(-6, -3));
        assertEquals(-2, MathOps.divide(-6, 3));
        assertEquals(-2, MathOps.divide(6, -3));
    }

    @Test
    void testDivideByOne() {
        assertEquals(5, MathOps.divide(5, 1));
        assertEquals(-5, MathOps.divide(-5, 1));
    }

    @Test
    void testDivideZeroNumerator() {
        assertEquals(0, MathOps.divide(0, 5));
    }

    @Test
    void testDivideByZeroThrows() {
        Exception exception = assertThrows(ArithmeticException.class, () -> MathOps.divide(5, 0));
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    void testSubtractPositiveNumbers() {
        assertEquals(1, MathOps.subtract(3, 2));
    }

    @Test
    void testSubtractNegativeNumbers() {
        assertEquals(1, MathOps.subtract(-2, -3));
        assertEquals(-5, MathOps.subtract(-2, 3));
        assertEquals(5, MathOps.subtract(2, -3));
    }

    @Test
    void testSubtractZero() {
        assertEquals(2, MathOps.subtract(2, 0));
        assertEquals(-2, MathOps.subtract(0, 2));
        assertEquals(0, MathOps.subtract(0, 0));
    }
}