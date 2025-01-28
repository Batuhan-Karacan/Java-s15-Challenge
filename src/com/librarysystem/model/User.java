package com.librarysystem.model;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String id;
    private String name;
    private Set<Book> borrowedBooks;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new HashSet<>();
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public Set<Book> getBorrowedBooks() { return borrowedBooks; }
}