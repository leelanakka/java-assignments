package com.step.assignments;

public class Car extends Vehicle {
    private int gears;
    private String name;
    public Car(int movingSpeed,int gears,String name) {
        super(movingSpeed);
        this.gears = gears;
        this.name = name;
    }

    public void something(){
        System.out.println("it came here");
    }
}
