/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Contexto de un State Pattern,
 * en este caso una solicitud de préstamo bibliotecario
 * Tiene un modelo observable de notificación
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import java.time.LocalDate;
import Tema02.PatronObserver.library.Book;

public class LibraryLoanRequestContext {
    private LibraryLoanState currentState;
    private CreatedLibraryLoanState createdLibraryLoanState;
    private AdmittedLibraryLoanState admittedLibraryLoanState;
    private ProcessedLibraryLoanState processedLibraryLoanState;
    private FinishedLibraryLoanState finishedLibraryLoanState;
    private DeclinedLibraryLoanState declinedLibraryLoanState;

    private LibraryLoanNotification libraryLoanNotification;
    private LoansLibrary loansLibrary;
    private Book book;
    private LibraryUser libraryUser;

    // fecha de creación
    private LocalDate createdDate;
    // fecha de recogida del libro
    private LocalDate pickupDate;

    public LibraryLoanState getCurrentState() {
        return this.currentState;
    }

    public void setCurrentState(LibraryLoanState currentState) {
        this.currentState = currentState;
    }

    public CreatedLibraryLoanState getCreatedLibraryLoanState() {
        return this.createdLibraryLoanState;
    }

    public AdmittedLibraryLoanState getAdmittedLibraryLoanState() {
        return this.admittedLibraryLoanState;
    }

    public ProcessedLibraryLoanState getProcessedLibraryLoanState() {
        return this.processedLibraryLoanState;
    }

    public FinishedLibraryLoanState getFinishedLibraryLoanState() {
        return this.finishedLibraryLoanState;
    }

    public DeclinedLibraryLoanState getDeclinedLibraryLoanState() {
        return this.declinedLibraryLoanState;
    }

    public LibraryLoanNotification getLibraryLoanNotification() {
        return this.libraryLoanNotification;
    }

    public void setLibraryLoanNotification(LibraryLoanNotification libraryLoanNotification) {
        this.libraryLoanNotification = libraryLoanNotification;
    }

    public LoansLibrary getLoansLibrary() {
        return this.loansLibrary;
    }

    public void setLoansLibrary(LoansLibrary loansLibrary) {
        this.loansLibrary = loansLibrary;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LibraryUser getLibraryUser() {
        return this.libraryUser;
    }

    public void setLibraryUser(LibraryUser libraryUser) {
        this.libraryUser = libraryUser;
    }

    public LocalDate getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getPickupDate() {
        return this.pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    public void process() {
        this.currentState.process(); // Delegación por composición
    }

    public LibraryLoanRequestContext(LoansLibrary loansLibrary, Book book, LibraryUser libraryUser) {
        super();
        this.libraryLoanNotification = new LibraryLoanNotification(this);
        this.loansLibrary = loansLibrary;
        this.book = book;
        this.libraryUser = libraryUser;
        this.createdLibraryLoanState = new CreatedLibraryLoanState(this);
        this.admittedLibraryLoanState = new AdmittedLibraryLoanState(this);
        this.processedLibraryLoanState = new ProcessedLibraryLoanState(this);
        this.finishedLibraryLoanState = new FinishedLibraryLoanState(this);
        this.declinedLibraryLoanState = new DeclinedLibraryLoanState(this);
        this.setCurrentState(this.createdLibraryLoanState);
    }
}