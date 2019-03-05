package com.step.assignments;

public class MegaBytesConverter {
    public static void main(String[] args) {

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int megaByte = kiloBytes/1024;
        int remainingKb = kiloBytes%1024;
        System.out.println(kiloBytes+" KB = "+megaByte+" MB and "+remainingKb+" KB");
    }
}
