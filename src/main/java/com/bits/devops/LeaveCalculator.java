package com.bits.devops;

public class LeaveCalculator {

    public int calculateLeaveBalance(int totalLeaves, int leavesTaken) {
        return totalLeaves - leavesTaken;
    }

    public double calculateLeaveEncashment(int unusedLeaves, double dailySalary) {
        return unusedLeaves * dailySalary;
    }
}
