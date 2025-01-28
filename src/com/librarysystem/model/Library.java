package com.librarysystem.model;

import com.librarysystem.service.ILoanable;

import java.util.ArrayList;
import java.util.List;

public class Library implements ILoanable {
    private List<Book> books;
    private List<User> users;
    private List<Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser (User user) {
        users.add(user);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public void loanBook(User user, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            loans.add(new Loan(user, book));
            System.out.println(user.getName() + " has borrowed " + book.getTitle());
        } else {
            System.out.println("The book is not available.");
        }
    }

    @Override
    public void returnBook(User user, Book book) {
        if (loans.stream().anyMatch(loan -> loan.getUser ().equals(user) && loan.getBook().equals(book))) {
            book.setAvailable(true);
            loans.removeIf(loan -> loan.getUser ().equals(user) && loan.getBook().equals(book));
            System.out.println(user.getName() + " has returned " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by the user.");
        }
    }
}