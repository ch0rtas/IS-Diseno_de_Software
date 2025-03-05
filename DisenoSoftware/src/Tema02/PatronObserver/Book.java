package Tema02.PatronObserver;

/**
 * Patrón Observer (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.04
 * @course INSO 2 - Diseño de Software
 */


public class Book {
    private String title;
    private String author;
    private BookState bookState;

    public Book(String title, String author, BookState bookState) {
        this.title = title;
        this.author = author;
        this.bookState = bookState;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookState getBookState() {
        return bookState;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", bookState=" + bookState + "]";
    }
}
