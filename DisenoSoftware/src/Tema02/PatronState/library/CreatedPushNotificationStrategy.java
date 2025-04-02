/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Estrategia de notificación correspondiente a la creación/aprobación
 * del préstamo bibliotecario, se informa de los dos días para la recogida
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import java.time.LocalDate;

public class CreatedPushNotificationStrategy extends LibraryPushNotificationStrategy {
    public void update(LibraryUser libraryUser, LibraryLoanNotification libraryLoanNotification) {
        LocalDate fechaNow = LocalDate.now();
        LocalDate fechaLastPickup = fechaNow.plusDays(2);
        String user = libraryLoanNotification.getLibraryLoanRequestContext().getLibraryUser().getName();
        String userNotification = "Notification to user : " + user +
                ", library loan admitted on " + fechaNow.toString() +
                ", due date to pickup " + fechaLastPickup;
        this.update(libraryUser, libraryLoanNotification, userNotification);
    }
}