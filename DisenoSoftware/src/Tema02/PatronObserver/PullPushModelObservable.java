package Tema02.PatronObserver;

/**
 * Patrón Observer (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.04
 * @course INSO 2 - Diseño de Software
 */


public interface PullPushModelObservable {
    void attach(PullPushObserver observer);
    void detach(PullPushObserver observer);
    void notifyObservers();
}
