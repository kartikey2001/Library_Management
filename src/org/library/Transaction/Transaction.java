package org.library.Transaction;

import org.library.Books.Book;
import org.library.Patron.Patron;

import java.util.Date;
import java.util.UUID;

public class Transaction {
    private String transactionId;
    private Book book;
    private Patron patron;



    private Date checkoutDate;
    private Date returnDate;



    //constructors
    public Transaction(String transactionId, Book book, Patron patron, Date checkoutDate, Date returnDate) {
        this.transactionId = transactionId;
        this.book = book;
        this.patron = patron;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
    }

    public Transaction( Patron patron,Book book) {
        this.transactionId = UUID.randomUUID().toString();
        this.book = book;
        this.patron = patron;
        this.checkoutDate = new Date();
        this.returnDate = null;
    }


    public void completeReturn(){
        this.returnDate=new Date();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Patron getPatron() {
        return patron;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
