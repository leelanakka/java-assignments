package com.step.assignments;

public class FactorPrinter {
    public static void main(String[] args) {

    }
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        for(int index=1;index<= number;index++){
            if (number%index ==0){
                System.out.println(index);
            }
        }
    }
}
