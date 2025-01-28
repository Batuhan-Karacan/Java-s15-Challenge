package com.librarysystem.manager;

import com.librarysystem.model.Book;
import com.librarysystem.model.Library;

public class BookManager {
    private Library library;

    public BookManager(Library library) {
        this.library = library;
    }

    public void addBook(Book book) {
        library.addBook(book);
    }
}