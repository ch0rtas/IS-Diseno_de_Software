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
        this.bookAlarm = new BookAlarm();
    }

    public BookAlarm getBookAlarm() {
        return bookAlarm;
    }

    // Devuelve un libro; si está en mal estado, notifica a los observadores.
    public void returnBook(Book book) {
        if (book.getBookState() == BookState.BAD) {
            bookAlarm.setLastBadBook(book);
            bookAlarm.notifyObservers();
        }
    }
}
