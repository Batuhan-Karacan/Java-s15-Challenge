package com.librarysystem.manager;

import com.librarysystem.model.User;
import com.librarysystem.model.Library;

public class UserManager {
    private Library library;

    public UserManager(Library library) {
        this.library = library;
    }

    public void addUser (User user) {
        library.addUser (user);
    }
}