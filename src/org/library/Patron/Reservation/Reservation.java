package org.library.Patron.Reservation;

import org.library.Books.Book;
import org.library.Inventory.Inventory;
import org.library.Lending.LendingProcess;
import org.library.Patron.Patron;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Reservation {
    private Patron patron;
    private Inventory inventory;
    private Queue<Patron> reserveredBook;


    public Reservation(Patron patron , Inventory inventory) {
        this.patron = patron;
        this.inventory = inventory;
        this.reserveredBook = new LinkedList<>();
    }

    public void addReservedBook(Patron patron , Book book){
        Book b = inventory.searchByISBN(book.getISBN());
        if(!b.isAvailable()){
            reserveredBook.add(patron);
        }else{
            System.out.println("Book is Available");
        }
    }
    public Queue<Patron> getReserveredBook() {
        return reserveredBook;
    }

    public void setReserveredBook(Queue<Patron> reserveredBook) {
        this.reserveredBook = reserveredBook;
    }

}
