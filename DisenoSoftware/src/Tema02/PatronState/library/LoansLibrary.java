/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Biblioteca especializada con patrón Singleton, instanciación en static
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import Tema02.PatronObserver.library.Book;
import Tema02.PatronObserver.library.Library;

public class LoansLibrary extends Library {
    private static LoansLibrary loansLibrary;

    private LoansLibrary() {
        super();
    }

    static {
        loansLibrary = new LoansLibrary();
    }

    public static LoansLibrary getInstance() {
        return loansLibrary;
    }

    public void returnBook(Book book, LibraryLoanRequestContext libraryLoanRequestContext) {
        super.returnBook(book);
        this.processLibraryLoan(libraryLoanRequestContext);
    }

    public void processLibraryLoan(LibraryLoanRequestContext libraryLoanRequestContext) {
        libraryLoanRequestContext.process(); // Delegación por inyección
    }
}