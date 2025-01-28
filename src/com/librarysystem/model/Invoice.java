package com.librarysystem.model;

public class Invoice {
    private User user;
    private Book book;
    private double amount;

    public Invoice(User user, Book book, double amount) {
        this.user = user;
        this.book = book;
        this.amount = amount;
    }

    // Getters
    public double getAmount() { return amount; }
}