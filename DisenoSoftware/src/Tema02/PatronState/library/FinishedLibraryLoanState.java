/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Estado interno (final) solicitud de préstamo finalizada
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

public class FinishedLibraryLoanState implements LibraryLoanStateTransition {
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
        System.out.println("Library loan request finished. Try new request");
    }

    public void declineLibraryLoan() {
        throw new UnsupportedOperationException("declineLibraryLoan not available");
    }

    public FinishedLibraryLoanState(LibraryLoanRequestContext libraryLoanRequestContext) {
        super();
        this.libraryLoanRequestContext = libraryLoanRequestContext;
    }

    public void process() {
        // Estado final
        this.returnLibraryLoan();
    }
}