package com.step.assignments;

public class LeapYearCalculator {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year){
        if(year <= 1 || year >= 9999){
            return false;
        }
        if (year %4 !=0 || year %100 ==0 && year %400 !=0){
            return false;
        }
        return true;
    }
}
