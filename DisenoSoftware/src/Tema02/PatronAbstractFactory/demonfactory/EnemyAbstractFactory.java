/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.demonfactory;

import Tema02.PatronAbstractFactory.Ejercicio37.Enemy;
import Tema02.PatronAbstractFactory.Ejercicio37.Daemon;
import Tema02.PatronAbstractFactory.Ejercicio37.Witch;

public interface EnemyAbstractFactory {
    Daemon createDaemon();
    Witch createWitch();
    Enemy createEnemy();
} 