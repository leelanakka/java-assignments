package com.step.assignments.com.step.assignments.day5;

public class MainClassOfBurger {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.itemizeHamburger();
        hamburger.setFirstType("Tomato", 0.27);
        hamburger.setSecondType("Lettuce", 0.75);
        hamburger.setThirdType("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.setFirstType("Egg", 5.43);
        healthyBurger.setHealthyExtraType1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeHamburger deluxeBurger = new DeluxeHamburger();
        deluxeBurger.setFirstType("Should not do this", 50.53);
        deluxeBurger.itemizeHamburger();
    }
}
