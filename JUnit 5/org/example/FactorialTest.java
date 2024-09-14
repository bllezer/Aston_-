package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial.calculateFactorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, Factorial.calculateFactorial(1));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test
    void testFactorialOfTen() {
        assertEquals(3628800, Factorial.calculateFactorial(10));
    }
}
