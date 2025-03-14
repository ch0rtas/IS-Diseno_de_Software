/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.24
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

// State Interface
public interface LibraryLoanState {
    void process(LibraryLoanRequestContext context);
    String getStateName();
}