/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Interface correspondiente al conjunto de transiciones del contexto State
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

public interface LibraryLoanStateTransition extends LibraryLoanState {
    public void admitLibraryLoan();
    public void pickupLibraryLoan();
    public void returnLibraryLoan();
    public void declineLibraryLoan();
}