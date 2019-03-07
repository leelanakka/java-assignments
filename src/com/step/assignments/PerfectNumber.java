package com.step.assignments;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number){
        if (number<1){
            return false;
        }
        int factorsSum = 0;
        for (int index=1; index<number;index++){
            if(number%index ==0){
                factorsSum+=index;
            }
        }
        return  factorsSum == number;
    }
}
