/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Estado interno solicitud de préstamo admitida
 * partiendo de los datos de la petición, se comprueba
 * la fecha de creación ya que se tienen dos días para recoger el libro.
 * Si se han respetado los dos días se procede a la recogida, se rechaza
 * la reserva en caso contrario
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import java.time.LocalDate;

public class AdmittedLibraryLoanState implements LibraryLoanStateTransition {
    private LibraryLoanRequestContext libraryLoanRequestContext;

    public LibraryLoanRequestContext getLibraryLoanRequestContext() {
        return this.libraryLoanRequestContext;
    }

    public void setLibraryLoanRequestContext(LibraryLoanRequestContext libraryLoanRequestContext) {
        this.libraryLoanRequestContext = libraryLoanRequestContext;
    }

    public void admitLibraryLoan() {
        throw new UnsupportedOperationException("admitLibraryLoan not available");
    }

    public void pickupLibraryLoan() {
        this.libraryLoanRequestContext.setPickupDate(LocalDate.now());
        this.libraryLoanRequestContext.setCurrentState(
                libraryLoanRequestContext.getProcessedLibraryLoanState());

        this.libraryLoanRequestContext.getLibraryLoanNotification().notifyRequestObserver(
                libraryLoanRequestContext.getLibraryUser(),
                new PickupPushNotificationStrategy());
    }

    public void returnLibraryLoan() {
        throw new UnsupportedOperationException("returnLibraryLoan not available");
    }

    public void declineLibraryLoan() {
        this.libraryLoanRequestContext.setCurrentState(
                this.libraryLoanRequestContext.getDeclinedLibraryLoanState());
    }

    public AdmittedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext) {
        super();
        this.libraryLoanRequestContext = libraryLoanRequestContext;
    }

    public void process() {
        LocalDate createdDate = this.libraryLoanRequestContext.getCreatedDate();
        LocalDate reservedUntilDate = createdDate.plusDays(2);
        LocalDate nowDate = LocalDate.now();
        if (nowDate.compareTo(reservedUntilDate) <= 0) {
            this.pickupLibraryLoan();
        } else {
            this.declineLibraryLoan();
        }
    }
}