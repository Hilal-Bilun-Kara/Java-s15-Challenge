package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void newBook(Book book) {
        for (Book existingBook : books) {
            if (existingBook.getBookID().equals(book.getBookID())) {
                System.out.println("A book with the same ID '" + book.getBookID() + "' already exists.");
                return;
            }
        }
        books.add(book);
        System.out.println("New book added: " + book.getName());
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void getReader(Reader reader) {
        for (Reader existingReader : readers) {
            if (existingReader.getName().equals(reader.getName())) {
                System.out.println("Reader with name '" + reader.getName() + "' is already registered.");
                return;
            }
        }

        // If the reader is not found in the list, add them
        readers.add(reader);
        System.out.println("New reader added: " + reader.getName());
    }

    public void lendBook(Book book, Reader reader) {
        if (books.contains(book)) {
            reader.borrowBook(book);
            book.changeOwner(reader);
            book.setStatus("borrowed");
            System.out.println("Book '" + book.getName() + "' lent to reader: " + reader.getName());
        } else {
            System.out.println("Book '" + book.getName() + "' is not available in the library.");
        }
    }

    public void takeBackBook(Book book, Reader reader) {
        if (books.contains(book)) {
            reader.returnBook(book);
            book.changeOwner(null);
            book.setStatus("available");
            System.out.println("Book '" + book.getName() + "' taken back from reader: " + reader.getName());
        }

    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + getBooks() +
                ", readers=" + getReaders() +
                '}';
    }
}
