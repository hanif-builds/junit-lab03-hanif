package com.university.lab.junit.lab03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator1Test {

    private Calculator1 calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator1();
    }

    @AfterEach
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, calc.divide(5, 2), 0.01);
    }

    @Test
    public void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }

    @Test
    public void testPowerNormalCase() {
        assertEquals(8, calc.power(2, 3));
    }

    @Test
    public void testPowerBoundaryExponentZero() {
        assertEquals(1, calc.power(5, 0));
    }

    @Test
    public void testPowerNegativeExponentThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.power(2, -1));
    }

    @Test
    public void testModulusNormalCase() {
        assertEquals(1, calc.modulus(7, 2));
    }

    @Test
    public void testModulusDivisorZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.modulus(4, 0));
    }
}