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

public enum UserType {
    STUDENT(15),
    PROFESSOR(10);

    private final int loanDays;

    private UserType(int loanDays) {
        this.loanDays = loanDays;
    }

    public int getLoanDays() {
        return this.loanDays;
    }
}