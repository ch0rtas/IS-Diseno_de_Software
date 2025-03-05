package Tema02.PatronObserver;

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
