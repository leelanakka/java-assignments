package com.step.assignments;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        printConversion(1.5);
        printConversion(25.42);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        int milesPerHour= (int) Math.round(kilometersPerHour/1.609);
        return milesPerHour ;
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }
        int milesPerHour= (int) toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
    }
}

