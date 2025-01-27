import java.util.ArrayList;
import java.util.List;

class Library implements ILoanable {
    protected List<Book> books; // protected olarak değiştirildi
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

    public List<Book> getBooks() { // Erişim için bir metot ekledik
        return books;
    }

    @Override
    public void loanBook(User user, Book book) {
        if (book.isAvailable() && user.getBorrowedBooks().size() < 5) {
            book.setAvailable(false);
            user.getBorrowedBooks().add(book);
            loans.add(new Loan(user, book));
            System.out.println("Book loaned: " + book.getTitle());
        } else {
            System.out.println("Book is not available or user has reached the limit.");
        }
    }

    @Override
    public void returnBook(User user, Book book) {
        if (user.getBorrowedBooks().contains(book)) {
            book.setAvailable(true);
            user.getBorrowedBooks().remove(book);
            loans.removeIf(loan -> loan.getUser ().equals(user) && loan.getBook().equals(book));
            System.out.println("Book returned: " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by the user.");
        }
    }

    public List<Book> listBooksByCategory(Category category) {
        List<Book> categorizedBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategory().equals(category)) {
                categorizedBooks.add(book);
            }
        }
        return categorizedBooks;
    }

    public List<Book> listBooksByAuthor(Author author) {
        List<Book> authoredBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                authoredBooks.add(book);
            }
        }
        return authoredBooks;
    }
}