package library;

import javax.naming.Name;
import java.util.Date;


public abstract class Book {
    protected String bookID;
    protected String author;
    protected String name;
    protected String status;
    protected String edition;
    protected Date dateOfPurchase;

    public Book(String bookID, String author, String name, String edition, Date dateOfPurchase) {
        this.bookID = bookID;
        this.author = author;
        this.name = name;
        this.status = "available";
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    public void getTitle() {
        System.out.println("Title: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeOwner(Reader reader) {
        System.out.println("Reader owner changed: " + reader.getName());
    }

    public void getOwner() {
        System.out.println("Current user information");
    }


    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getAuthor() {
        System.out.println("Author: " + author);    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("Author: " + getAuthor());
        System.out.println("Status: " + getStatus());
        System.out.println("Edition: " + getEdition());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Status updated to: " + newStatus);
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}