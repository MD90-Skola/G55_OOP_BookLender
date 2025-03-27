package se.lexicon.model;
import java.time.LocalDate;
import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */



public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;
    private String borrower; // valfritt om du vill hålla reda på vem som lånar

    // Konstruktor för en bok som är tillgänglig
    public Book(String title, String author) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.available = true;
        this.borrower = null;
    }

    // Getters och setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if (available) {
            this.borrower = null;
        }
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
        if(borrower != null) {
            this.available = false;
        }
    }

    // Metod som returnerar bokinformation som en sträng
    public String getBookInfo() {
        String info = "Låne ID: " + id + "\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Available: " + available;
        if (!available && borrower != null) {
            info += "\nBorrower: " + borrower;
        }
        return info;
    }

    // Metod för att låna boken
    public void borrow() {
        if (available) {
            available = false;
        } else {
            System.out.println("Boken är redan utlånad.");
        }
    }

    // Metod för att returnera boken
    public void returnBook() {
        if (!available) {
            available = true;
            borrower = null;
        } else {
            System.out.println("Boken är redan tillgänglig.");
        }
    }
}




// todo: needs completion
