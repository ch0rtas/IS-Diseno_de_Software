/**
 * Patrón Observer (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronObserver.library;

import java.util.ArrayList;
import java.util.List;

public class BookAlarm implements ModelPullPushObservable {
    private List<ModelPullPushObserver> observers;
    private Book book;

    public BookAlarm() {
        this(new ArrayList<>());
    }

    public BookAlarm(List<ModelPullPushObserver> observers) {
        this.observers = observers;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
        updateObservers();
    }

    @Override
    public void attach(ModelPullPushObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(ModelPullPushObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void updateObservers() {
        for (ModelPullPushObserver observer : observers) {
            observer.update(this, this.book);
        }
    }
}
