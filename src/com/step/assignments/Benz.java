package com.step.assignments;

public class Benz extends Car {
    public Benz(int movingSpeed, int gears) {
        super(movingSpeed, gears,"benz");
    }

    public static void main(String[] args) {
        Benz benz = new Benz(20, 4);
        benz.something();
        benz.decreaseSpeed(2);
        System.out.println(benz.getMovingSpeed());
    }
}
