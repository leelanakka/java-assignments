package com.step.assignments;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,33));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }

    public static boolean isCatPlaying(boolean summer,int temperature){
        int upperLimit = 35;
        if(summer){
            upperLimit = 45;
        }
        if(25 <= temperature && temperature <= upperLimit){
            return true;
        }
        return false;
    }
}
