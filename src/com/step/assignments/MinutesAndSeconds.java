package com.step.assignments;

public class MinutesAndSeconds {
    public static void main(String[] args) {
        System.out.println(getDurationString(61, 22));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(-5, 6));
        System.out.println(getDurationString(9, -3));
        System.out.println(getDurationString(9, 64));
        System.out.println(getDurationString(9, 9));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(48645900));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (isInvalidTime(minutes, seconds)) {
            return "invalid input";
        }
        int totalSeconds = (minutes * 60) + seconds;
        int hours = totalSeconds / 3600;
        int remainingMinutes = (totalSeconds % 3600) / 60;
        int remainingSeconds = (totalSeconds % 60);
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
    }

    public static boolean isInvalidTime(int minutes, int seconds) {
        return minutes <= 0 || seconds < 0 || seconds > 59;
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        return getDurationString(minutes, 0);
    }
}

