package com.step.assignments.libraryexercise;

import java.util.HashSet;
import java.util.Set;

public class Reader {
    private Set<String> books;
    private String name;

    public Reader(String name) {
        this.name = name;
        this.books = new HashSet<>();
    }

    public void addBook(String bookName) {
        this.books.add(bookName);
    }

    public void returnBook(String bookName, String readerName) {
        this.books.remove(bookName);
    }

    public boolean checkBook(String bookName) {
        return books.contains(bookName);
    }

    public void returnBook(String bookName) {
        System.out.println("sorry you can't  remove book by yourself");
    }

    public void getAllBooks() {
        for (String book : this.books) {
            System.out.println(book);
        }
    }

    public String getName() {
        return name;
    }
}
