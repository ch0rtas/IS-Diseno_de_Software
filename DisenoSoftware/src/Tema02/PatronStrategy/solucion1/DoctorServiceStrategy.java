package Tema02.PatronStrategy.solucion1;

public interface DoctorServiceStrategy extends ServiceStrategy {
    public void inspectChildren();
    public void sendResultsInspection();
    public void sendInvoice();
}
