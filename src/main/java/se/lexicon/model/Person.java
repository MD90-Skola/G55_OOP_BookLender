package se.lexicon.model;

public class Person {
    // Statisk räknare som börjar på 0
    private static int sequenver = 0;

    // Instansvariabler
    private int id;
    private String firstName;
    private String lastName;

    // Konstruktor som tar emot förnamn och efternamn
    public Person(String firstName, String lastName) {
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Privat metod för att hämta nästa id från räknaren
    private static int getNextId() {
        return ++sequenver;
    }

    // Getters och setters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.trim().isEmpty()){
            throw new IllegalArgumentException("Förnamn får inte vara tomt.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.trim().isEmpty()){
            throw new IllegalArgumentException("Efternamn får inte vara tomt.");
        }
        this.lastName = lastName;
    }

    // Metod för att låna en bok – uppdaterar bokens status
    public void loanBook(Book book) {
        book.borrow();
        // Om du vill kan du sätta personens namn som låntagare i boken:
        book.setBorrower(getPersonInformation());
        System.out.println(getPersonInformation() + " lånar boken:\n" + book.getBookInfo());
    }

    // Metod för att returnera en bok – uppdaterar bokens status
    public void returnBook(Book book) {
        book.returnBook();
        System.out.println(getPersonInformation() + " returnerar boken:\n" + book.getBookInfo());
    }

    // Metod som returnerar information om personen
    public String getPersonInformation() {
        return "Person ID: " + id + ", Namn: " + firstName + " " + lastName;
    }
}
