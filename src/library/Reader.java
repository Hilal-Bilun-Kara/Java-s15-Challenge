package library;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person {
    private List<Book> books;

    public Reader(String name) {
        super(name, null);
        this.books = new ArrayList<>();
    }

    @Override
    public String whoYouAre() {
        return super.whoYouAre();
    }

    public void purchaseBook(Book book) {
        books.add(book);
        System.out.println("Purchased book: " + book.getName());
    }

    public void borrowBook(Book book) {
        if (book.getStatus().equals("available")) {
            book.setStatus("borrowed");
            books.add(book);
            System.out.println("Borrowed book: " + book.getName());
        } else {
            System.out.println("Book is not available for borrowing: " + book.getName());
        }
    }

    public void returnBook(Book book) {
        if (books.remove(book)) {
            book.setStatus("available");
            System.out.println("Returned book: " + book.getName());
        } else {
            System.out.println("Book not found in your collection: " + book.getName());
        }
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in your collection.");
        } else {
            System.out.println("Books in your collection:");
            for (Book book : books) {
                System.out.println("- " + book.getName() + " by " + book.getAuthor());
            }
        }
    }
}