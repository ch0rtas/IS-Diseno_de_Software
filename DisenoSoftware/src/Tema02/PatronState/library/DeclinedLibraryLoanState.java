/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Estado interno solicitud de préstamo rechazada
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

public class DeclinedLibraryLoanState implements LibraryLoanStateTransition {
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
        throw new UnsupportedOperationException("returnLibraryLoan not available");
    }

    public void declineLibraryLoan() {
        System.out.println("Library loan request declined. Try new request");
    }

    public DeclinedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext) {
        super();
        this.libraryLoanRequestContext = libraryLoanRequestContext;
    }

    public void process() {
        // this.declineLibraryLoan();
    }
}