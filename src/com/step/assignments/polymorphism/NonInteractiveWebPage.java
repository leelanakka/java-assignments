package com.step.assignments.polymorphism;

public class NonInteractiveWebPage extends WebPage {

    @Override
    public void Click() {
        System.out.println("you cannot click here");
    }
}


//    - Design an entity called NonInteractiveWebPage which should
//        - have a method to return content on page to print (return some dummy string from method)
//        - should not support click on the WebPage
//        - have a method to display given content on the WebPage (take a string and sout)
