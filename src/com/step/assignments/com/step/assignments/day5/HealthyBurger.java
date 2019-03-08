package com.step.assignments.com.step.assignments.day5;

public class HealthyBurger extends Hamburger {
    private String healthyExtraType1;
    private double healthyExtraPrice1;

    private String healthyExtraType2;
    private double healthyExtraPrice2;


    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown rye");
    }

    public void setHealthyExtraType1(String type, double price) {
        this.healthyExtraType1 = type;
        this.healthyExtraPrice1 = price;
    }

    public void setHealthyExtraType2(String type, double price) {
        this.healthyExtraType2 = type;
        this.healthyExtraPrice1 = price;
    }
}
