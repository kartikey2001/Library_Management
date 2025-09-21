package org.library.Inventory;

import org.library.Books.Book;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {


    private HashMap<String, Book> books;

    //constructors
    public Inventory(HashMap<String, Book> books) {
        this.books = books;
    }

    public Inventory() {
        this.books = new HashMap<>();
    }

    //methods
    public void addBook(Book book){
        books.put(book.getISBN(), book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String ISBN){
        if (books.containsKey(ISBN)) {
            Book removed = books.remove(ISBN);
            System.out.println("Book removed: " + removed.getTitle());
        } else {
            System.out.println("No book found with ISBN: " + ISBN);
        }
    }

    public void updateBook(Book book){
        if (books.containsKey(book.getISBN())){
            books.put(book.getISBN(), book);
            System.out.println("Book updated : "+book.getTitle());
        }else{
            System.out.println("book with this isbn no. is not found :" +book.getISBN());
        }
    }

    public List<Book> SearchByTitle(String Title){
        List<Book> result=new ArrayList<>();
        for (Book book: books.values()){
            if (book.getTitle().equalsIgnoreCase(Title)){
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByAuthor(String Author_name){
        List<Book> result =new ArrayList<>();
        for (Book book: books.values()){
            if (book.getAuthor_name().equalsIgnoreCase(Author_name)){
                result.add(book);
            }
        }
        return result;
    }

    public Book searchByISBN(String ISBN){

        return books.get(ISBN);
    }

    public List<String> getAvailableBooks() {
        List<String> available = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                available.add(book.getTitle());
            }
        }
        return available;
    }

    public List<String> getBorrowedBook() {
        List<String> borrowed = new ArrayList<>();
        for (Book book : books.values()) {
            if (!book.isAvailable()) {
                borrowed.add(book.getTitle());
            }
        }
        return borrowed;
    }



    //getters and setters
    public HashMap<String, Book> getBooks() {
        return books;
    }

    public void setBooks(HashMap<String, Book> books) {
        this.books = books;
    }

}
