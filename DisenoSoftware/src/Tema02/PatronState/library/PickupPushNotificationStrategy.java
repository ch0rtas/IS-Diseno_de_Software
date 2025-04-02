/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Estrategia de notificación correspondiente a la recogida del libro,
 * se informa de los días de préstamo hasta su devolución
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import java.time.LocalDate;

public class PickupPushNotificationStrategy extends LibraryPushNotificationStrategy {
    public void update(LibraryUser libraryUser, LibraryLoanNotification libraryLoanNotification) {
        LocalDate pickupDate = libraryLoanNotification.getLibraryLoanRequestContext().getPickupDate();
        int days = libraryLoanNotification.getLibraryLoanRequestContext().getLibraryUser().getUserType().getLoanDays();
        LocalDate dueDate = pickupDate.plusDays(days);
        String user = libraryLoanNotification.getLibraryLoanRequestContext().getLibraryUser().getName();
        String userNotification = "Notification to user : " + user +
                ", library loan pickup on " + pickupDate.toString() +
                ", due date to return " + dueDate +
                " days(" + days + ")";
        this.update(libraryUser, libraryLoanNotification, userNotification);
    }
}