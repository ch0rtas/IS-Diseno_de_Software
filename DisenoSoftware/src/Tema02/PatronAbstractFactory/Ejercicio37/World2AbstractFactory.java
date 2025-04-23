/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

public class World2AbstractFactory implements EnemyAbstractFactory {

    @Override
    public Daemon createDaemon() {
        return new World2Daemon("Big Daemon");
    }

    @Override
    public Witch createWitch() {
        return new World2Witch("Big Witch");
    }

    @Override
    public Enemy createEnemy() {
        return null; // No se usa en el Ejercicio 37
    }
} 