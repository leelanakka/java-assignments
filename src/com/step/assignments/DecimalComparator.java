package com.step.assignments;

public class DecimalComparator {
    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){
        int number1 = (int) (float)(num1*1000);
        int number2 = (int) (float)(num2*1000);
        return number1==number2;
    }
}
