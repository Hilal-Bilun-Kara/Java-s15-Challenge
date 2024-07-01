package library;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person{
    private List<Book> books;

    public Author(String name) {
        super(name,null);
        this.books = new ArrayList<>();
    }

    public void newBook(Book book) {
        books.add(book);
        System.out.println("New book added: " + book.getName());
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books written yet by " + name);
        } else {
            System.out.println("Books written by " + name + ":");
            for (Book book : books) {
                System.out.println("- " + book.getName());
            }
        }
    }

    @Override
    public String whoYouAre() {
        return super.whoYouAre();
    }
}
