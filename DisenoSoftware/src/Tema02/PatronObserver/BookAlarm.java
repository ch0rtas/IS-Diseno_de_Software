package Tema02.PatronObserver;

/**
 * Patrón Observer (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.04
 * @course INSO 2 - Diseño de Software
 */


import java.util.ArrayList;
import java.util.List;

public class BookAlarm implements PullPushModelObservable {

    // Variable de estado: último libro en mal estado.
    private Book lastBadBook;

    // Lista de observadores suscritos.
    private List<PullPushObserver> observers;

    public BookAlarm() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(PullPushObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(PullPushObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        // Notifica a todos los observadores enviando la variable de estado por 'push'.
        for (PullPushObserver observer : observers) {
            observer.update(this, lastBadBook);
        }
    }

    public void setLastBadBook(Book book) {
        this.lastBadBook = book;
    }

    // Protocolo pull: los observadores pueden consultar esta información.
    public Book getLastBadBook() {
        return lastBadBook;
    }
}
