/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Estado interno solicitud de préstamo creada
 * partiendo de los datos de la petición, se comprueba
 * que el usuario tenga la cuenta activa
 * para admitir la petición, o rechazarla en caso contrario
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import java.time.LocalDate;

public class CreatedLibraryLoanState implements LibraryLoanStateTransition {
    private LibraryLoanRequestContext libraryLoanRequestContext;

    public LibraryLoanRequestContext getLibraryLoanRequestContext() {
        return this.libraryLoanRequestContext;
    }

    public void setLibraryLoanRequestContext(LibraryLoanRequestContext libraryLoanRequestContext) {
        this.libraryLoanRequestContext = libraryLoanRequestContext;
    }

    public void admitLibraryLoan() {
        this.libraryLoanRequestContext.setCreatedDate(LocalDate.now());
        this.libraryLoanRequestContext.setCurrentState(
                this.libraryLoanRequestContext.getAdmittedLibraryLoanState());
        // Se notifica al usuario que su solicitud ha sido aceptada
        this.libraryLoanRequestContext.getLibraryLoanNotification().notifyRequestObserver(
                libraryLoanRequestContext.getLibraryUser(),
                new CreatedPushNotificationStrategy());
    }

    public void pickupLibraryLoan() {
        throw new UnsupportedOperationException("pickupLibraryLoan not available");
    }

    public void returnLibraryLoan() {
        throw new UnsupportedOperationException("returnLibraryLoan not available");
    }

    public void declineLibraryLoan() {
        this.libraryLoanRequestContext.setCurrentState(
                this.libraryLoanRequestContext.getDeclinedLibraryLoanState());
    }

    public CreatedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext) {
        super();
        this.libraryLoanRequestContext = libraryLoanRequestContext;
    }

    public void process() {
        if (this.libraryLoanRequestContext.getLibraryUser().getActiveAccount()) {
            this.admitLibraryLoan();
        } else {
            this.declineLibraryLoan();
        }
    }
}
