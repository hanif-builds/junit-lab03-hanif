// BankAccountHomeworkTest.java
package com.university.lab.junit.lab03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountHomeworkTest {

    @Test
    public void testValidDepositIncreasesBalance() {
        BankAccountHomework account = new BankAccountHomework();
        account.deposit(500);
        assertEquals(500, account.getBalance(), 0.01);
    }

    @Test
    public void testNegativeDepositThrows() {
        BankAccountHomework account = new BankAccountHomework();
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
    }

    @Test
    public void testOverdraftThrows() {
        BankAccountHomework account = new BankAccountHomework();
        account.deposit(100);
        assertThrows(IllegalStateException.class, () -> account.withdraw(200));
    }

    @Test
    public void testWithdrawBelow100MarksInactive() {
        BankAccountHomework account = new BankAccountHomework();
        account.deposit(150);
        account.withdraw(80);
        assertFalse(account.isActive());
    }

    @Test
    public void testWithdrawStayingAbove100StaysActive() {
        BankAccountHomework account = new BankAccountHomework();
        account.deposit(300);
        account.withdraw(100);
        assertTrue(account.isActive());
    }
}