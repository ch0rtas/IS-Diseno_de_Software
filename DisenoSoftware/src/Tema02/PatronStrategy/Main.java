package Tema02.PatronStrategy;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia();

        // Día 15: Visita del Dr. Wang
        System.out.println("\nDía 15: Visita del Dr. Wang");
        guarderia.setDoctorStrategy(new DrWangStrategy());
        guarderia.realizarVisita();

        // Día 28: Visita del Dr. Fong
        System.out.println("\nDía 28: Visita del Dr. Fong");
        guarderia.setDoctorStrategy(new DrFongStrategy());
        guarderia.realizarVisita();
    }
}
