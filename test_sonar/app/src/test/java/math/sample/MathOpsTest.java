package math.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}