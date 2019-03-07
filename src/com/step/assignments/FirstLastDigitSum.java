package com.step.assignments;

public class FirstLastDigitSum {
    public static void main(String[] args) {

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastNumber = number % 10;
        int firstNumber = number;
        while (number >= 10) {
            firstNumber = number / 10;
            number = number / 10;
        }
        return firstNumber + lastNumber;
    }
}
