package Tema02.PatronObserver;

/**
 * Patrón Observer (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.04
 * @course INSO 2 - Diseño de Software
 */


public interface PullPushObserver {
    // El 'observable' es el sujeto que notifica,
    // y 'arg' es la variable de estado enviada por push (puede ser null).
    void update(PullPushModelObservable observable, Object arg);
}
