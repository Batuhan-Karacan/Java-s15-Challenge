import java.util.Date;

class Loan {
    private User user;
    private Book book;
    private Date loanDate;

    public Loan(User user, Book book) {
        this.user = user;
        this.book = book;
        this.loanDate = new Date();
    }

    // Getters
    public User getUser () { return user; }
    public Book getBook() { return book; }
    public Date getLoanDate() { return loanDate; }
}