package org.library.Patron;


import org.library.Books.Book;
import org.library.Transaction.Transaction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Patron {



    private String patronId;
    private String patronName;
    private String patronEmail;
    private List<String> borrowedBooks;
    private List<Transaction> history;
    private List<Book> reservation;

    public Patron(String patronId, String patronName, String patronEmail) {
        this.patronId = patronId;
        this.patronName = patronName;
        this.patronEmail = patronEmail;
        this.borrowedBooks = new ArrayList<>();
        this.history = new ArrayList<>();
        this.reservation = new ArrayList<>();
    }

    public Patron(List<String> borrowedBooks, List<Transaction> history) {
        this.borrowedBooks = borrowedBooks;
        this.history = history;
    }

    public void borrowBook(Book book){
        if (book.isAvailable()){
            borrowedBooks.add(book.getISBN());
            book.setAvailable(false);
            Transaction tx=new Transaction(this, book);
            history.add(tx);
            System.out.println(getPatronName()+ " borrowed : "+ book.getTitle());
        } else {

            System.out.println("Book is not available: "+book.getTitle());
        }
    }

    public void returnBook(Book book){
        if(borrowedBooks.remove(book.getISBN())){
            book.setAvailable(true);

            for (Transaction tx :history){
                if(tx.getBook().equals(book) && tx.getReturnDate()==null){
                    tx.completeReturn();
                    break;
                }
            }
            System.out.println(patronName +" returned : " +book.getTitle());

        }else {
            System.out.println("this book is not Available by : " + patronName);
        }
    }


    public String getPatronId() {
        return patronId;
    }

    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }

    public String getPatronName() {
        return patronName;
    }

    public void setPatronName(String patronName) {
        this.patronName = patronName;
    }

    public String getPatronEmail() {
        return patronEmail;
    }

    public void setPatronEmail(String patronEmail) {
        this.patronEmail = patronEmail;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public List<Transaction> getHistory() {
        return history;
    }

    public void setHistory(List<Transaction> history) {
        this.history = history;
    }

    public List<Book> getReservation() {
        return reservation;
    }

    public void setReservation(List<Book> reservation) {
        this.reservation = reservation;
    }
}
