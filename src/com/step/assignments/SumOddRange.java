package com.step.assignments;

public class SumOddRange {
    public static void main(String[] args) {

    }

    public static boolean isOdd(int number) {
        if (number < 0 || number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0 || end < start) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (isOdd(index)) {
                sum += index;
            }
        }
        return sum;
    }

}
