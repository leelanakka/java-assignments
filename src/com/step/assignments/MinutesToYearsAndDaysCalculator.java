package com.step.assignments;

public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {

    }
    public static void printYearsAndDays(long minutes){
        if(minutes <0 ){
            System.out.println("Invalid Value");
            return;
        }
        int days = (int) (minutes/1440);
        int years = (int) (days/365);
        int remainingDays = (int) (days%365);
        System.out.println(minutes+" min = "+years+" y and "+remainingDays+" d" );
    }

}

