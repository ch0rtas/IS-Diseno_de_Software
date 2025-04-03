/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Modelo observable 'concreto' bajo protocolo Pull-Push
 * La variable de estado es una solicitud de préstamo bibliotecario
 * Tiene una estrategia de notificación según el tipo de mensaje
 * Usa dos tipos de delegación para las notificaciones Push
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import java.util.ArrayList;
import java.util.List;
import Tema02.PatronObserver.library.ModelPullPushObserver;
import Tema02.PatronObserver.library.ModelPullPushObservable;

public class LibraryLoanNotification implements ModelPullPushObservable {
    private List<ModelPullPushObserver> observers = new ArrayList<ModelPullPushObserver>();
    private LibraryPushNotificationStrategy libraryPushNotificationStrategy;
    private LibraryLoanRequestContext libraryLoanRequestContext;

    public LibraryPushNotificationStrategy getLibraryPushNotificationStrategy() {
        return this.libraryPushNotificationStrategy;
    }

    public void setLibraryPushNotificationStrategy(LibraryPushNotificationStrategy libraryPushNotificationStrategy) {
        this.libraryPushNotificationStrategy = libraryPushNotificationStrategy;
    }

    public LibraryLoanRequestContext getLibraryLoanRequestContext() {
        return this.libraryLoanRequestContext;
    }

    public void setLibraryLoanRequestContext(LibraryLoanRequestContext libraryLoanRequestContext) {
        this.libraryLoanRequestContext = libraryLoanRequestContext;
    }

    public void attach(ModelPullPushObserver observer) {
        this.observers.add(observer);
    }

    public void detach(ModelPullPushObserver observer) {
        this.observers.remove(observer);
    }

    public void updateObservers() {
        for (ModelPullPushObserver observer : observers) {
            this.libraryPushNotificationStrategy.update(observer, this, this.libraryLoanRequestContext);
        }
    }

    // Permitimos que nos indiquen el tipo de estrategia de notificación
    public void notifyRequestObserver(LibraryUser observer, LibraryPushNotificationStrategy libraryPushNotificacionStrategy) {
        // delegación por inyección
        libraryPushNotificacionStrategy.update(observer, this);
    }

    public LibraryLoanNotification(LibraryLoanRequestContext libraryLoanRequestContext) {
        super();
        this.libraryLoanRequestContext = libraryLoanRequestContext;
    }
}