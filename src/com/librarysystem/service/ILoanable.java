package com.librarysystem.service;

import com.librarysystem.model.User;
import com.librarysystem.model.Book;

public interface ILoanable {
    void loanBook(User user, Book book);
    void returnBook(User user, Book book);
}