interface ILoanable {
    void loanBook(User user, Book book);
    void returnBook(User user, Book book);
}