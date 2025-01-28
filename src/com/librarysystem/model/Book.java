package com.librarysystem.model;

public class Book {
    private String id;
    private String title;
    private Author author;
    private Category category;
    private boolean isAvailable;

    public Book(String id, String title, Author author, Category category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isAvailable = true;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public Author getAuthor() { return author; }
    public Category getCategory() { return category; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    public void setTitle(String title) { this.title = title; }
}