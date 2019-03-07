package com.step.assignments;

public class LastDigitChecker {
    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a)||!isValid(b)||!isValid(c)) {
            return false;
        }
        if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }
}
