package Tema02.PatronObserver;

/**
 * Patrón Observer (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.04
 * @course INSO 2 - Diseño de Software
 */

public class Library {
    private BookAlarm bookAlarm;

    public Library() {
        this(new BookAlarm());
    }

    public Library(BookAlarm bookAlarm) {
        this.bookAlarm = bookAlarm;
    }

    public BookAlarm getBookAlarm() {
        return this.bookAlarm;
    }

    public void attachObserver(ModelPullPushObserver observer) {
        this.bookAlarm.attach(observer);
    }

    public void detachObserver(ModelPullPushObserver observer) {
        this.bookAlarm.detach(observer);
    }

    public void returnBook(Book book) {
        if (book.getBookState().equals(BookState.BAD)) {
            this.bookAlarm.setBook(book);
        }
    }
}
