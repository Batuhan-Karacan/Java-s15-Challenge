class BookManager {
    private Library library;

    public BookManager(Library library) {
        this.library = library;
    }

    public void updateBook(String id, String newTitle) {
        for (Book book : library.getBooks()) { // getBooks() metodu kullanıldı
            if (book.getId().equals(id)) {
                book.setTitle(newTitle); // setTitle metodu kullanıldı
                System.out.println("Book updated: " + newTitle);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void deleteBook(String id) {
        library.getBooks().removeIf(book -> book.getId().equals(id)); // getBooks() metodu kullanıldı
        System.out.println("Book deleted.");
    }
}