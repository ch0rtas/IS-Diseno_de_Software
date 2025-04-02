/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Estrategia de notificación correspondiente a la devolución del libro,
 * se incluye el estado del libro en la devolución
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import java.time.LocalDate;

public class FinishedPushNotificationStrategy extends LibraryPushNotificationStrategy {
    public void update(LibraryUser libraryUser, LibraryLoanNotification libraryLoanNotification) {
        LocalDate fechaNow = LocalDate.now();
        String user = libraryLoanNotification.getLibraryLoanRequestContext().getLibraryUser().getName();
        String userNotification = "Notification to user : " + user +
                ", library loan returned on " + fechaNow.toString() +
                ", " + libraryLoanNotification.getLibraryLoanRequestContext().getBook().toString();
        this.update(libraryUser, libraryLoanNotification, userNotification);
    }
}