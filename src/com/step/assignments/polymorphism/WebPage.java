package com.step.assignments.polymorphism;

public class WebPage implements Displayable,Printable {

    public String getContent() {
        return "this is also some content";
    }

    public void Click() {
        System.out.println("you have clicked on the WebPage");
    }

    public void displayContent(String content) {
        System.out.println(content);
    }
}

//    - Design an entity called WebPage which should have
//        - a method to return content on page to print (return some dummy string from method)
//        - a method to click on the WebPage (sout in the method)
//        - a method to display given content on the WebPage (take a string and sout)