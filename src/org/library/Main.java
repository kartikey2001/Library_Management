package org.library;

import org.library.Books.Book;
import org.library.Inventory.Inventory;
import org.library.Lending.LendingProcess;
import org.library.Patron.Patron;
import org.library.Transaction.Transaction;

public class Main {
    public static void main(String[] args) {
        Inventory inv=new Inventory();
        Book b1 = new Book("Clean Code", "12345", "Robert Martin", 2008,"Coding");
        Book b2 = new Book("Design Patterns", "67890", "Gof", 1994,"Coding");
        inv.addBook(b1);
        inv.addBook(b2);



        Patron p1=new Patron("P001", "Alice", "alice@example.com");

        LendingProcess lending=new LendingProcess(inv);
        lending.checkout(p1,b1);
        lending.checkout(p1,b2);

        lending.returnBook(p1,b1);



        System.out.println("\nAvailable Books:");
        for (String b : inv.getAvailableBooks()) {
            System.out.println(b);
        }

        // Display transactions
        System.out.println("\nActive Transactions:");
        for (Transaction txn : lending.getActiveTransactions()) {
            System.out.println(txn.getBook().getTitle() + " borrowed by " + txn.getPatron().getPatronName());
        }
    }



}
