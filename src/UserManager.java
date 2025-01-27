class UserManager {
    private Library library;

    public UserManager(Library library) {
        this.library = library;
    }

    public void registerUser (User user) {
        library.addUser (user);
        System.out.println("User  registered: " + user.getName());
    }
}