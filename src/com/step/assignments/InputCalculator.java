package com.step.assignments;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        System.out.println("please enter here");
        inputThenPrintSumAndAverage();
    }

        public static void inputThenPrintSumAndAverage() {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int numberOfInputs = 0;
            int average = 0;
            while (scanner.hasNext()) {
                if (!scanner.hasNextInt()) {
                    break;
                }
                numberOfInputs++;
                int number = scanner.nextInt();
                sum += number;
                average = Math.round( (float) sum / numberOfInputs);

            }
            System.out.println("SUM = " + sum + " AVG = " + average);
            scanner.close();
        }
}
