package Tema02.PatronObserver.library;

/**
 * Patrón Observer (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.04
 * @course INSO 2 - Diseño de Software
 */


public class Book {
    public static final String DEFAULT_VALUE = "N/A";
    private String title;
    private String author;
    private BookState bookState;

    public Book(String title) {
        this(title, Book.DEFAULT_VALUE);
    }

    public Book(String title, String author) {
        this(title, author, BookState.UNKNOWN);
    }

    public Book(String title, String author, BookState bookState) {
        this.title = title;
        this.author = author;
        this.bookState = bookState;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookState getBookState() {
        return bookState;
    }

    public void setBookState(BookState bookState) {
        this.bookState = bookState;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", bookState=" + bookState + "]";
    }
}