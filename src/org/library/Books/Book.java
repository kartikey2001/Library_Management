package org.library.Books;

public class Book {

    private String Title;
    private String ISBN;
    private String Author_name;
    private int publicationYear;
    private String book_genre;
    private boolean isAvailable;

    //constructors
    public Book(String Title, String ISBN, String author_name, int publicationYear, String book_genre) {
        this.Title = Title;
        this.ISBN = ISBN;
        Author_name = author_name;
        this.publicationYear = publicationYear;
        this.book_genre = book_genre;
        this.isAvailable = true;
    }


    public void getDetails(){
        System.out.println( "book Title :" + getTitle());
        System.out.println( "book ISBN :" + getISBN());
        System.out.println( "book Author :" + getAuthor_name());
        System.out.println( "book publicationYear :" + getPublicationYear());
        System.out.println( "book genre :" + getBook_genre());
    }



    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor_name() {
        return Author_name;
    }

    public void setAuthor_name(String author_name) {
        Author_name = author_name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getBook_genre() {
        return book_genre;
    }

    public void setBook_genre(String book_genre) {
        this.book_genre = book_genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}



