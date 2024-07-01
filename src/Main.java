import library.Book;
import library.Library;
import library.MemberRecord;
import library.Reader;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "John Doe", "Sample Book 1", "First Edition",new Date());
        Book book2 = new Book("B002", "Jane Smith", "Sample Book 2", "Second Edition",new Date());

        Reader reader1 = new Reader("Bilun");
        Reader reader2 = new Reader("Berkay");

        Library library = new Library();

        // Add books to the library
        library.newBook(book1);
        library.newBook(book2);

        // Search for a book by name
        List<Book> books = library.getBooks();
        System.out.println(library);
        System.out.println(books);

        library.takeBackBook(book1,reader1);
        System.out.println(library);

        library.lendBook(book1,reader1);
        System.out.println(library);
    }
}