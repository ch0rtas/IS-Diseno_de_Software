package Tema02.PatronStrategy.solucion1;

/**
 * Patrón Strategy (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.02.15
 * @course INSO 2 - Diseño de Software
 */


public class NoDoctorServiceStrategy implements DoctorServiceStrategy {
    public void inspectChildren() {
        System.out.println("Servicio no disponible.");
    }
    public void sendResultsInspection() {
        System.out.println("Servicio no disponible.");
    }
    public void sendInvoice() {  // Método corregido
        System.out.println("Servicio no disponible.");
    }
    @Override
    public String toString() {
        return "NoDoctorServiceStrategy []";
    }
    public void applyServiceStrategy() {
        System.out.println("Servicio no disponible.");
    }
}
