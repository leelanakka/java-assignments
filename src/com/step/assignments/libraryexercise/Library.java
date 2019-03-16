package com.step.assignments.libraryexercise;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, BookCopy> books;
    private Map<String, Reader> readers;

    public Library(Map<String, BookCopy> books, Map<String, Reader> readers) {
        this.books = books;
        this.readers = readers;
    }

    public Library() {
        this.books = new HashMap<>();
        this.readers = new HashMap<>();
    }

    public boolean searchBook(String bookName) {
        return this.books.containsKey(bookName);
    }

    public boolean borrowBook(String readerName, String bookName) {
        if (searchBook(bookName) && getCurrentReader(bookName) == null) {
            Reader reader = readers.get(readerName);
            reader.addBook(bookName);
            BookCopy bookCopy = books.get(bookName);
            bookCopy.assignBook(readerName);
            System.out.println(bookName + " allocated to " + readerName);
            return true;
        }
        System.out.println(bookName + " is not available ");
        return false;
    }

    public void returnBook(String readerName, String bookName) {
        Reader reader = readers.get(readerName);
        reader.returnBook(bookName, bookName);
        BookCopy bookCopy = books.get(bookName);
        bookCopy.returnBook();
    }

    public String getCurrentReader(String bookName) {
        BookCopy bookCopy = this.books.get(bookName);
        return bookCopy.getReader();
    }

    public void addBook(Librarian librarian, String bookName) {
        this.books.put(bookName, new BookCopy(bookName));
    }

    public void addReader(Reader reader) {
        this.readers.put(reader.getName(), reader);
    }
}

//library
//    Has got a lot of books (This could be a lot (millions of) books)
//    Has got a readers who read books in the library
//
//    As a reader I should be able to search a book in the library by its name
//    As a reader I should be able to borrow a book from library
//    As a reader I should be able to check if I have a book already borrowed
//    As a reader I should be able to return a borrowed books
//
//    As a librarian I should be able add a new book into library
//    As a librarian I should be able to check who has borrowed a specific book
//    As a librarian I should be able to check books borrowed by a user
//    As a librarian I should be able to remove a book from library
//    As a librarian I should be able to search if a book was removed in the past, so it can be bought again if necessary