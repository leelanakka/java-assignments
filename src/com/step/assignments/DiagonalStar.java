package com.step.assignments;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);

    }

    public static void printSquareStar(int side) {
        if (side<5){
            System.out.println("Invalid Value");
            return;
        }
        String pattern = "";
        for (int i = 1; i <= side; i++) {
            pattern = "";
            for (int j = 1; j <= side; j++) {
                if (i == 1 || i == side || j ==1 || j==side || j==i || j==side-i+1 ) {
                    pattern += "*";
                    continue;
                }
                pattern += " ";
            }
            System.out.println(pattern);
        }
    }
}