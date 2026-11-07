package com.bits.devops;

public class LeaveCalculator {
               // BITS ID: s2024sl70033

    public int calculateLeaveBalance(int totalLeaves, int leavesTaken) {
        return totalLeaves - leavesTaken;
    }

    public double calculateLeaveEncashment(int unusedLeaves, double dailySalary) {
        return unusedLeaves * dailySalary;
    }
}
