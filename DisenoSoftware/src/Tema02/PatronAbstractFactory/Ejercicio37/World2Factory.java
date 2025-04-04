/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

public class World2Factory implements EnemyAbstractFactory {

    @Override
    public Daemon createDaemon() {
        // Ejemplo de configuración específica para Mundo 2
        return new World2Daemon("Big Daemon",
                20,
                1 * World.LEVEL2.getComplexFactor(),
                "verdes");
    }

    @Override
    public Witch createWitch() {
        // Ejemplo de configuración específica para Mundo 2
        // Brujas con 2*2 = 4 vidas en Mundo 2 (o 2 base multiplicado por factor, según tu lógica)
        return new World2Witch("Big Witch",
                30,
                2 * World.LEVEL2.getComplexFactor(),
                "Magic wand and magic broom");
    }
}
