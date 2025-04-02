/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Enumerado con los valores posibles de usuario de biblioteca
 * Indica la duración en días del préstamo bibliotecario
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import Tema02.PatronObserver.library.BookState;
import Tema02.PatronObserver.library.Book;

public class LibraryLoanTest {
    public static void main(String[] args) {
        LoansLibrary library = LoansLibrary.getInstance(); // Singleton

        Book bookGood = new Book("Design Patterns: Elements of Reusable Object-Oriented Software",
                "Gang of Four", BookState.GOOD);

        // TODO Los docentes tienen 10 días de préstamo, los alumnos 15 días.
        LibraryUser professor = new LibraryUser("MA",
                "mesas@u-tad.com", UserType.PROFESSOR, true);
        LibraryUser student = new LibraryUser("Ines",
                "ines@live.u-tad.com", UserType.STUDENT, true);

        LibraryLoanRequestContext professorLoanRequest =
                new LibraryLoanRequestContext(library, bookGood, professor);
        LibraryLoanRequestContext studentLoanRequest =
                new LibraryLoanRequestContext(library, bookGood, student);

        // La biblioteca gestiona las reservas
        library.processLibraryLoan(studentLoanRequest);
        library.processLibraryLoan(professorLoanRequest);

        // La biblioteca gestiona la recogida del libro del docente.
        library.processLibraryLoan(professorLoanRequest);

        // La biblioteca gestiona la recogida del libro del alumno.
        library.processLibraryLoan(studentLoanRequest);

        // La biblioteca gestiona la devolución del libro del alumno.
        library.returnBook(studentLoanRequest.getBook(), studentLoanRequest);

        // La biblioteca gestiona la devolución del libro del profesor.
        library.returnBook(professorLoanRequest.getBook(), professorLoanRequest);
    }
}