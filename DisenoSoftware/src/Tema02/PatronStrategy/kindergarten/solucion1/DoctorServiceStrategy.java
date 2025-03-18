package Tema02.PatronStrategy.kindergarten.solucion1;

/**
 * Patrón Strategy (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.02.15
 * @course INSO 2 - Diseño de Software
 */


public interface DoctorServiceStrategy extends ServiceStrategy {
    public void inspectChildren();
    public void sendResultsInspection();
    public void sendInvoice();
}
