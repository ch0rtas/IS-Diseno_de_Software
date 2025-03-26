/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.24
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import Tema02.PatronObserver.library.Book;
import java.time.LocalDate;

public class LibraryLoanRequestContext {
    private LibraryLoanState currentState;
    private LoansLibrary loansLibrary;
    private Book book;
    private LibraryUser libraryUser;
    private LocalDate createdDate;
    private LocalDate pickupDate;
    private LocalDate returnDate;

    public LibraryLoanRequestContext(LoansLibrary loansLibrary, Book book, LibraryUser libraryUser) {
        this.loansLibrary = loansLibrary;
        this.book = book;
        this.libraryUser = libraryUser;
        this.createdDate = LocalDate.now();
        this.currentState = new CreatedState(); // Start in Created state
    }

    public void process() {
        currentState.process(this);
    }

    public void setState(LibraryLoanState state) {
        this.currentState = state;
    }

    public boolean isPickupWithinDeadline() {
        return LocalDate.now().isBefore(createdDate.plusDays(2));
    }

    public LocalDate getReturnDate() {
        pickupDate = LocalDate.now();
        returnDate = pickupDate.plusDays(libraryUser.getUserType().getLoanDays());
        return returnDate;
    }

    // Getters
    public Book getBook() {
        return book;
    }

    public LibraryUser getLibraryUser() {
        return libraryUser;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getPickupDate() {
        return pickupDate != null ? pickupDate : LocalDate.now();
    }
}