package com.step.assignments;

public class NumberPalindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int number) {
        int num = Math.abs(number);
        number = num;
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            num = num / 10;
        }
        return number == reverse;
    }
}
