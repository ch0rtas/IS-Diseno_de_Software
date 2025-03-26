/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.24
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

class ProcessedState implements LibraryLoanState {
    @Override
    public void process(LibraryLoanRequestContext context) {
        // System.out.println("Processing Processed State: Book is currently on loan");
    }

    @Override
    public String getStateName() {
        return "Processed";
    }
}