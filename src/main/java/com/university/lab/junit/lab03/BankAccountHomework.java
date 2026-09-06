// BankAccountHomework.java
package com.university.lab.junit.lab03;

public class BankAccountHomework {
    private double balance;
    private boolean active = true;

    public void deposit(double amt) {
        if (amt < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > balance) {
            throw new IllegalStateException("Insufficient balance.");
        }
        balance -= amt;
        if (balance < 100) {
            active = false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }
}