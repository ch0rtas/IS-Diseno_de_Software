package Tema02.PatronStrategy;

public class DrFongStrategy implements DoctorStrategy {
    @Override
    public void examinarNinos() {
        System.out.println("Dr. Fong: Examinando la pronunciación de los niños.");
    }

    @Override
    public void enviarFactura() {
        System.out.println("Dr. Fong: Enviando la factura por los exámenes de logopedia.");
    }

    @Override
    public void enviarResultados() {
        System.out.println("Dr. Fong: Enviando los resultados del examen de logopedia a los padres.");
    }
}
