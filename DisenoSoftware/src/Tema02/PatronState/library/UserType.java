/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.24
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

public enum UserType {
    STUDENT(15),  // Students get 15 days loan
    PROFESSOR(10); // Professors get 10 days loan

    private final int loanDays;

    UserType(int loanDays) {
        this.loanDays = loanDays;
    }

    public int getLoanDays() {
        return loanDays;
    }
}