/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.junit.lab03;

/**
 *
 * @author hanif
 */
public class Calculator1 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    public long power(int base, int exp) {
        if (exp < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative.");
        }
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot compute modulus with divisor 0.");
        }
        return a % b;
    }
}