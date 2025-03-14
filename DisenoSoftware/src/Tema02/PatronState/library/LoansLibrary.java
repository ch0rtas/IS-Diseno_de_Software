/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.24
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import Tema02.PatronObserver.library.Book;
import Tema02.PatronObserver.library.Library;

import java.time.LocalDate;

public class LoansLibrary extends Library {
    public LoansLibrary() {
        super();
    }

    public void returnBook(Book book, LibraryLoanRequestContext libraryLoanRequestContext) {
        System.out.println("Notification to user : " + libraryLoanRequestContext.getLibraryUser().getName() +
                ", library loan returned on " + LocalDate.now() +
                ", " + book);

        libraryLoanRequestContext.setState(new FinishedState());
    }

    public void processLibraryLoan(LibraryLoanRequestContext libraryLoanRequestContext) {
        libraryLoanRequestContext.process();
    }
}