package com.step.assignments.polymorphism;

public class Main {
    public static void main(String[] args) {
        Displayable display = new Console();
        display.displayContent("some content to test");

        Displayable webPage = new WebPage();
        webPage.displayContent("text for webpage");
        System.out.println(((WebPage) webPage).getContent());
    }
}
