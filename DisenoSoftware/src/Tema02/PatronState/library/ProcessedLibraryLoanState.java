/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Estado interno solicitud de préstamo procesada
 * a la espera de la devolución del libro
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

public class ProcessedLibraryLoanState implements LibraryLoanStateTransition {
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
        throw new UnsupportedOperationException("pickupLibraryLoan not available");
    }

    public void returnLibraryLoan() {
        this.libraryLoanRequestContext.setCurrentState(
                this.libraryLoanRequestContext.getFinishedLibraryLoanState());
        this.libraryLoanRequestContext.getLibraryLoanNotification().notifyRequestObserver(
                libraryLoanRequestContext.getLibraryUser(),
                new FinishedPushNotificationStrategy());
    }

    public void declineLibraryLoan() {
        throw new UnsupportedOperationException("declineLibraryLoan not available");
    }

    public ProcessedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext) {
        super();
        this.libraryLoanRequestContext = libraryLoanRequestContext;
    }

    public void process() {
        this.returnLibraryLoan();
    }
}