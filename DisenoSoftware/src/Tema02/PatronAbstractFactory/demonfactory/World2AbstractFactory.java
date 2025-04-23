/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.demonfactory;

import Tema02.PatronAbstractFactory.Ejercicio37.Daemon;
import Tema02.PatronAbstractFactory.Ejercicio37.Witch;
import Tema02.PatronAbstractFactory.Ejercicio37.Enemy;
import Tema02.PatronAbstractFactory.Ejercicio37.World2Daemon;
import Tema02.PatronAbstractFactory.Ejercicio37.World2Witch;

public class World2AbstractFactory implements Tema02.PatronAbstractFactory.demonfactory.EnemyAbstractFactory {

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
        // En el mundo 2, la probabilidad es 30/70
        if (Math.random() < 0.3) {
            return createDaemon();
        } else {
            return createWitch();
        }
    }
} 