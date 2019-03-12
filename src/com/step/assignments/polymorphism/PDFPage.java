package com.step.assignments.polymorphism;

public class PDFPage implements Printable {

    public String getContent() {
        return "this is some text";
    }
}

//Exercise on Polymorphism
//    - Design an entity called Console which should have
//        - a method to display given content on the Console (take a string and sout)
//
//    - Design an entity called PDFPage which should have
//        - a method to return content on page to print (return some dummy string from method)
//
//    - Design an entity called WebPage which should have
//        - a method to return content on page to print (return some dummy string from method)
//        - a method to click on the WebPage (sout in the method)
//        - a method to display given content on the WebPage (take a string and sout)
//
//    - Design an entity called NonInteractiveWebPage which should
//        - have a method to return content on page to print (return some dummy string from method)
//        - should not support click on the WebPage
//        - have a method to display given content on the WebPage (take a string and sout)
//
//Use Abstraction where possible and call each of them in a Main method to show Polymorphism