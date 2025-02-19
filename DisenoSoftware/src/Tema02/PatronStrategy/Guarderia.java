package Tema02.PatronStrategy;

public class Guarderia {
    private DoctorStrategy doctorStrategy;

    // Establecer la estrategia (doctor)
    public void setDoctorStrategy(DoctorStrategy doctorStrategy) {
        this.doctorStrategy = doctorStrategy;
    }

    // Ejecutar las actividades comunes
    public void realizarVisita() {
        if (doctorStrategy == null) {
            System.out.println("No se ha asignado ningún doctor.");
            return;
        }
        doctorStrategy.examinarNinos();
        doctorStrategy.enviarFactura();
        doctorStrategy.enviarResultados();
    }
}
