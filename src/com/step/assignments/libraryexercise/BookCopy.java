package com.step.assignments.libraryexercise;

public class BookCopy {
    private String name;
    private String reader;

    public BookCopy(String name) {
        this.name = name;
    }

    public void assignBook(String reader){
        this.reader = reader;
    }

    public void returnBook(){
        this.reader ="";
    }

    public String getReader(){
        return this.reader;
    }
}

