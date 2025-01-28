package com.librarysystem.main;

import com.librarysystem.model.*;
import com.librarysystem.manager.*;
import com.librarysystem.service.*;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        BookManager bookManager = new BookManager(library);
        UserManager userManager = new UserManager(library);
        LibraryService libraryService = new LibraryService(library);

        Author author = new Author("George Orwell");
        Category category = new Category("Dystopian");
        Book book = new Book("1", "1984", author, category);
        bookManager.addBook(book);

        User user = new User("1", "Alice");
        userManager.addUser (user);

        libraryService.loanBook(user, book);

    }
}