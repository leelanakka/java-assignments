package com.step.assignments.com.step.assignments.day5;

public class Hamburger {
    private String rollType;
    private String meat;
    private double price;
    private String name;
    private String firstType;
    private String secondType;
    private String thirdType;
    private String fourthType;

    public Hamburger(String rollType, String meat, double price, String name) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public void setFirstType(String firstType, double price) {
        this.firstType = firstType;
        this.price += price;
        System.out.println("the " + name + " it came here with " + price);
    }

    public void setSecondType(String secondType, double price) {
        this.secondType = secondType;
        this.price += price;
        System.out.println("the " + name + " it came here with " + price);
    }

    public void setThirdType(String thirdType, double price) {
        this.thirdType = thirdType;
        this.price += price;
        System.out.println("the " + name + " it came here with " + price);
    }

    public void setFourthType(String fourthType, double price) {
        this.fourthType = fourthType;
        this.price += price;
    }

    public double itemizeHamburger() {
        System.out.println(this.name + " hamburger " + " on a " + this.rollType + " roll " + "with " + this.meat + ", price is " + this.price);
        if (this.firstType != null) {
            System.out.println(" Added " + this.firstType + " and new price is " + this.price);
        }
        if (this.secondType != null) {
            System.out.println(" Added " + this.secondType + " and new price is " + this.price);
        }
        if (this.thirdType != null) {
            System.out.println(" Added " + this.thirdType + " and new price is " + this.price);
        }
        if (this.fourthType != null) {
            System.out.println(" Added " + this.fourthType + " and new price is " + this.price);
        }
        return this.price;
    }
}