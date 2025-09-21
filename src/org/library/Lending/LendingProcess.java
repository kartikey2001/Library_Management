package org.library.Lending;

import org.library.Books.Book;
import org.library.Patron.Patron;
import org.library.Transaction.Transaction;
import org.library.Inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class LendingProcess {


    private Inventory inventory;
    private List<Transaction> transactions;

    public LendingProcess(Inventory inventory) {
        this.inventory = inventory;
        this.transactions = new ArrayList<>();
    }


     public void checkout(Patron patron, Book book){
        Book b=inventory.searchByISBN(book.getISBN());
        if (b.isAvailable()){
            patron.borrowBook(book);
            Transaction tx=new Transaction(patron,book);
            transactions.add(tx);
        }else{
            System.out.println(" this book is not available " + book.getISBN());
        }
     }

     public void returnBook(Patron patron, Book book){
        Book b=inventory.searchByISBN(book.getISBN());
        if(!b.isAvailable()){
            patron.returnBook(book);
        } else {
            System.out.println("Invalid ISBN: "+book.getISBN());
        }
     }

    public List<Transaction> getActiveTransactions() {
        List<Transaction> active = new ArrayList<>();
        for (Transaction txn : transactions) {
            if (txn.getReturnDate() == null) {
                active.add(txn);
            }
        }
        return active;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }


}
