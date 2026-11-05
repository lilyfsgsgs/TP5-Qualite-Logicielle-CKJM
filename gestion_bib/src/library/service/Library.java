
package library.service;

import java.util.ArrayList;
import java.util.List;

import library.model.Book;
import library.model.Lendable;

public class Library {

    private List<Lendable> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    // Méthode conservée pour le TP SonarQube :
    // ne vérifie pas si les livres sont déjà empruntés.
    public List<Lendable> getAvailableItems() {
        List<Lendable> availableItems = new ArrayList<>();

        for (Lendable item : items) {
            availableItems.add(item);
        }

        return availableItems;
    }

    public void listAllItems() {
        for (Lendable item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println(
                    book.getTitle() + " by " + book.getAuthor()
                );
            } else {
                System.out.println("Unknown item type");
            }
        }
    }
}
