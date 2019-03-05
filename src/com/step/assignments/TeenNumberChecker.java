package com.step.assignments;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(0,13,0));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        boolean condition = isNumbersBetween(num1) || isNumbersBetween(num2) || isNumbersBetween(num3);
        return condition;
    }

    public static boolean isTeen(int number) {
        return isNumbersBetween(number);
    }

    public static boolean isNumbersBetween(int number) {
        return number >= 13 && number <= 19;
    }
}

