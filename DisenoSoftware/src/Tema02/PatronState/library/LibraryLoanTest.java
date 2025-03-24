package Tema02.PatronState.library;

import Tema02.PatronObserver.library.Book;
import Tema02.PatronObserver.library.BookState;

public class LibraryLoanTest {
    public static void main(String[] args) {
        LoansLibrary library = new LoansLibrary();
        Book bookGood = new Book("Gang of four Design patterns", "Gang of four", BookState.GOOD);

        LibraryUser profesor = new LibraryUser("MA", "miguel.mesas@u-tad.com", UserType.PROFESSOR, true);
        LibraryUser student = new LibraryUser("Inés", "ines@u-tad.com", UserType.STUDENT, true);

        LibraryLoanRequestContext professorLoanRequest = new LibraryLoanRequestContext(library, bookGood, profesor);
        LibraryLoanRequestContext studentLoanRequest = new LibraryLoanRequestContext(library, bookGood, student);

        // Procesar solicitudes de préstamo
        library.processLibraryLoan(studentLoanRequest);
        library.processLibraryLoan(professorLoanRequest);

        // Recoger libros
        library.processLibraryLoan(professorLoanRequest);
        library.processLibraryLoan(studentLoanRequest);

        // Devolver libros
        library.returnBook(studentLoanRequest.getBook(), studentLoanRequest);
        library.returnBook(professorLoanRequest.getBook(), professorLoanRequest);
    }
}