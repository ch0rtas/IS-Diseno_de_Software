/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

public class World1Factory implements EnemyAbstractFactory {

    @Override
    public Daemon createDaemon() {
        // Ejemplo de configuración específica para Mundo 1
        return new World1Daemon("Daemon",
                10,
                1 * World.LEVEL1.getComplexFactor(),
                "rojo");
    }

    @Override
    public Witch createWitch() {
        // Ejemplo de configuración específica para Mundo 1
        return new World1Witch("Witch",
                15,
                2,  // Las brujas comienzan con 2 vidas en Mundo 1
                "Magic wand");
    }
}
