package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;





//








public class App {
    public static void main(String[] args) {
        // Skapa en bok och en person
        Book bok1 = new Book("Ondvinter", "Björkelid, Anders");
        Person person1 = new Person("Michel", "Dahl");

        // Visa ursprunglig information
        System.out.println("Bokinformation innan utlåning:");
        System.out.println(bok1.getBookInfo());
        System.out.println("\nPersoninformation:");
        System.out.println(person1.getPersonInformation());

        // Simulera utlåning
        System.out.println("\n--- Utlåning ---");
        person1.loanBook(bok1);
        System.out.println("\nBokinformation efter utlåning:");
        System.out.println(bok1.getBookInfo());

        // Simulera retur
        System.out.println("\n--- Återlämning ---");
        person1.returnBook(bok1);
        System.out.println("\nBokinformation efter retur:");
        System.out.println(bok1.getBookInfo());
    }
}



// todo: needs completion
// Initialize and display Book & Person instances
// Simulate borrowing a book
// Simulate returning a book
