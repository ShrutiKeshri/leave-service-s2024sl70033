package com.bits.devops;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeaveCalculatorTest {

    LeaveCalculator calculator = new LeaveCalculator();

    @Test
    public void testLeaveBalance() {
        assertEquals(10, calculator.calculateLeaveBalance(20, 10));
    }

    @Test
    public void testLeaveEncashment() {
        assertEquals(5000.0, calculator.calculateLeaveEncashment(10, 500.0), 0.01);
    }

    @Test
    public void testZeroLeaveBalance() {
        assertEquals(0, calculator.calculateLeaveBalance(10, 10));
    }
}
