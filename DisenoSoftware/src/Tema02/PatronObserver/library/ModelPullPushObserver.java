/**
 * Patrón Observer (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronObserver.library;

public interface ModelPullPushObserver {
    void update(ModelPullPushObservable observable, Object object);
}
