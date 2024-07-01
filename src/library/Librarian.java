package library;

public class Librarian extends Person{
    private Library library;

    public Librarian(String name, Library library) {
        super(name, null);
        this.library = library;
    }

    public Book searchBook(String bookName) {
        for (Book book : library.getBooks()) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                return book;
            }
        }
        System.out.println("Book not found: " + bookName);
        return null;
    }

    public boolean verifyMember(Reader reader) {
        return library.getReaders().contains(reader);
    }


    public void issueBook(Book book, Reader reader) {
        if (verifyMember(reader)) {
            library.lendBook(book,reader);
        } else {
            System.out.println("Reader is not a member of the library.");
        }
    }

    public double calculateFine(Book book, int daysOverdue) {
        double finePerDay = 1.0;
        return finePerDay * daysOverdue;
    }

    public void createBill(Book book, Reader reader, int daysOverdue) {
        double fine = calculateFine(book, daysOverdue);
        System.out.println("Bill for " + reader.getName() + ":");
        System.out.println("Book: " + book.getName());
        System.out.println("Days Overdue: " + daysOverdue);
        System.out.println("Fine: $" + fine);
    }

    public void returnBook(Book book, Reader reader) {
        library.takeBackBook(book,reader);
    }
}
