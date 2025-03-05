package Tema02.PatronStrategy.solucion1;

/**
 * Patrón Strategy (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.02.15
 * @course INSO 2 - Diseño de Software
 */


public class TestKinderGardenService {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Bienvenido al KinderGarden Service");
        System.out.println("========================================\n");

        // Suponemos que pasa consulta el Dr. Fong
        System.out.println(">> Servicio médico en curso: Dr. Fong <<");
        KinderGardenServiceContext kinderGardenContext = new KinderGardenServiceContext(new FongDoctorStrategy());
        kinderGardenContext.applyServiceStrategy();
        System.out.println("-------------------------------------\n");

        // Cambiamos el servicio médico, ahora pasa consulta el Dr. Wong
        System.out.println(">> Cambiando al servicio médico: Dr. Wang <<");
        kinderGardenContext.setServiceStrategy(new WangDoctorStrategy());
        kinderGardenContext.applyServiceStrategy();
        System.out.println("-------------------------------------\n");

        System.out.println("========================================");
        System.out.println("     Fin del servicio KinderGarden");
        System.out.println("========================================");
    }
}
