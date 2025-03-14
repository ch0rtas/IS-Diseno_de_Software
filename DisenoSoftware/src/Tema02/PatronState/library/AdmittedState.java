/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.24
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

class AdmittedState implements LibraryLoanState {
    @Override
    public void process(LibraryLoanRequestContext context) {
        // System.out.println("Processing Admitted State: Checking pickup deadline");
        if (context.isPickupWithinDeadline()) {
            context.setState(new ProcessedState());
            System.out.println("Notification to user : " + context.getLibraryUser().getName() +
                    ", library loan pickup on " + context.getPickupDate() +
                    ", due date to return " + context.getReturnDate() +
                    " days(" + context.getLibraryUser().getUserType().getLoanDays() + ")");
        } else {
            context.setState(new RejectedState());
            System.out.println("Loan request rejected due to missed pickup deadline");
        }
    }

    @Override
    public String getStateName() {
        return "Admitted";
    }
}