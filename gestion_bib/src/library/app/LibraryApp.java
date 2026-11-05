
package library.app;

import library.model.Book;
import library.model.DigitalBook;
import library.service.Library;

public class LibraryApp {

    public static void main(String[] args) {

        // Création de la bibliothèque
        Library library = new Library();

        // Création des livres
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        DigitalBook book3 = new DigitalBook("Digital Fortress", "Dan Brown", 5);

        // Ajout des livres à la bibliothèque
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        // Affichage des livres disponibles
        System.out.println("List of Books in the Library:");
        library.listAllItems();

        // Traitement numérique déplacé de Book vers NumberClassifier
        NumberClassifier.printClassification(10);
    }
}
