package com.step.assignments.com.step.assignments.day5;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super("white", "Sausage & Bacon", 14.54, "deluxe");
        super.setFirstType("chips", 5);
        super.setSecondType("drinks", 6.12);
    }

    @Override
    public void setFirstType(String firstType, double price) {
        System.out.println("sorry you can't add new items");
    }

    @Override
    public void setSecondType(String secondType, double price) {
        System.out.println("sorry you can't add new items");
    }

    @Override
    public void setThirdType(String thirdType, double price) {
        System.out.println("sorry you can't add new items");
    }

    @Override
    public void setFourthType(String fourthType, double price) {
        System.out.println("sorry you can't add new items");
    }
}


//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all addition's, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.