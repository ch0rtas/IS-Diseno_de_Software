package Tema02.PatronStrategy.solucion1;

public class FongDoctorStrategy implements DoctorServiceStrategy {
    public void inspectChildren() {
        System.out.println(this + ", estoy inspeccionando al niño.");
    }
    public void sendResultsInspection() {
        System.out.println(this + ", estoy mandando los resultados de la inspección.");
    }
    public void sendInvoice() {
        System.out.println(this + ", estoy mandando la factura.");
    }
    @Override
    public String toString() {
        return "FongDoctorStrategy";
    }
    // El Dr. Fong envía la factura antes que los resultados.
    public void applyServiceStrategy() {
        this.inspectChildren();
        this.sendInvoice();
        this.sendResultsInspection();
    }
}
