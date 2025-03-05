package Tema02.PatronStrategy.solucion2;

/**
 * Patrón Strategy (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.02.15
 * @course INSO 2 - Diseño de Software
 */


import Tema02.PatronStrategy.solucion1.DoctorServiceStrategy;

public class KinderGardenActivityContext implements DoctorServiceStrategy {
    private DoctorServiceStrategy doctorServiceStrategy; // Nombre corregido

    public KinderGardenActivityContext(DoctorServiceStrategy doctorServiceStrategy) {
        super();
        this.doctorServiceStrategy = doctorServiceStrategy;
    }

    public DoctorServiceStrategy getDoctorServiceStrategy() {
        return this.doctorServiceStrategy;
    }

    public void setDoctorServiceStrategy(DoctorServiceStrategy doctorServiceStrategy) {
        this.doctorServiceStrategy = doctorServiceStrategy;
    }

    public void applyServiceStrategy() {
        // El contexto marca el orden de ejecución de las actividades
        // Actividad 1
        this.inspectChildren();
        // Actividad 2
        this.sendResultsInspection();
        // Actividad 3
        this.sendInvoice();
    }

    public void inspectChildren() {
        this.doctorServiceStrategy.inspectChildren();
    }

    public void sendResultsInspection() {
        this.doctorServiceStrategy.sendResultsInspection();
    }

    public void sendInvoice() {
        this.doctorServiceStrategy.sendInvoice();
    }
}
