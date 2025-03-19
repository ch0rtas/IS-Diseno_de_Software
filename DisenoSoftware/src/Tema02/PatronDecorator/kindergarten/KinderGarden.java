/**
 * Patrón Decorator (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.16
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronDecorator.kindergarten;

import java.util.ArrayList;
import java.util.List;

public class KinderGarden {
    private List<Baby> babies;

    public KinderGarden() {
        this.babies = new ArrayList<>();
    }

    public List<Baby> getBabies() {
        return babies;
    }

    /**
     * Método para "pasar lista" e imprimir la descripción de cada bebé
     * según las recompensas que tenga en ese momento.
     */
    public void checkBabies() {
        System.out.println("====Pasamos lista====");
        for (Baby baby : babies) {
            System.out.println(baby.getDescription());
        }
    }
}
