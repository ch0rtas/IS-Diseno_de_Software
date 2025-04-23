/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

public class World1AbstractFactory implements EnemyAbstractFactory {

    @Override
    public Daemon createDaemon() {
        return new World1Daemon("Daemon");
    }

    @Override
    public Witch createWitch() {
        return new World1Witch("Witch");
    }

    @Override
    public Enemy createEnemy() {
        // En el mundo 1, la probabilidad es 50/50
        if (Math.random() < 0.5) {
            return createDaemon();
        } else {
            return createWitch();
        }
    }
} 