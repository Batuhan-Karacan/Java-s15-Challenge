package com.librarysystem.service;

import com.librarysystem.model.Library;
import com.librarysystem.model.User;
import com.librarysystem.model.Book;

public class LibraryService {
    private Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    public void loanBook(User user, Book book) {
        library.loanBook(user, book);
    }

    public void returnBook(User user, Book book) {
        library.returnBook(user, book);
    }
}