package com.step.assignments.libraryexercise;

public class Main {
    public static void main(String[] args) {
        Librarian leela = new Librarian("leela");
        Library library = new Library();
        library.addBook(leela, "wings of fire");
        library.addBook(leela, "c");
        library.addBook(leela, "java");
        library.addBook(leela, "js");
        library.addBook(leela, "c++");
        library.addBook(leela, "scala");

        Reader prasad = new Reader("prasad");
        library.addReader(prasad);
        System.out.println(library.borrowBook("prasad", "c"));
        System.out.println(library.borrowBook("prasad", "something"));
        System.out.println(library.borrowBook("prasad", "java"));
        System.out.println(library.borrowBook("prasad", "js"));

        prasad.returnBook("c");

        prasad.getAllBooks();
        System.out.println(library.getCurrentReader("c"));
    }
}
