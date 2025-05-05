package math.sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}