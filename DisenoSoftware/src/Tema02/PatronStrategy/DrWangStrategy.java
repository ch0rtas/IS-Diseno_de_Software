package Tema02.PatronStrategy;

public class DrWangStrategy implements DoctorStrategy {
    @Override
    public void examinarNinos() {
        System.out.println("Dr. Wang: Examinando los ojos de los niños.");
    }

    @Override
    public void enviarFactura() {
        System.out.println("Dr. Wang: Enviando la factura por los exámenes de visión.");
    }

    @Override
    public void enviarResultados() {
        System.out.println("Dr. Wang: Enviando los resultados del examen de visión a los padres.");
    }
}
