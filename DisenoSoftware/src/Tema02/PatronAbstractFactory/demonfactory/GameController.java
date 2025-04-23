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
import Tema02.PatronAbstractFactory.Ejercicio37.World;

public class GameController {
    private static GameController gameController = new GameController(new World1AbstractFactory());

    public static GameController getInstance() {
        return gameController;
    }

    private Tema02.PatronAbstractFactory.demonfactory.EnemyAbstractFactory enemyAbstractFactory;

    private GameController(Tema02.PatronAbstractFactory.demonfactory.EnemyAbstractFactory enemyAbstractFactory) {
        this.enemyAbstractFactory = enemyAbstractFactory;
    }

    public Tema02.PatronAbstractFactory.demonfactory.EnemyAbstractFactory getEnemyAbstractFactory() {
        return enemyAbstractFactory;
    }

    public void setEnemyAbstractFactory(Tema02.PatronAbstractFactory.demonfactory.EnemyAbstractFactory enemyAbstractFactory) {
        this.enemyAbstractFactory = enemyAbstractFactory;
    }

    public double getRandomDoubleBetweenRange(double min, double max) {
        return (Math.random() * (max - min)) + min;
    }

    public Daemon createDaemon() {
        return this.enemyAbstractFactory.createDaemon();
    }

    public Witch createWitch() {
        return this.enemyAbstractFactory.createWitch();
    }

    public Enemy createEnemy() {
        return this.enemyAbstractFactory.createEnemy();
    }

    public void play() {
        Integer maxEnemies = 100;
        Enemy[] enemies = new Enemy[maxEnemies];
        Integer witches = 0;
        Integer daemons = 0;

        System.out.println("Empieza el juego en el Mundo 1");
        System.out.println("Creamos un demonio en el mundo 1 " + this.createDaemon());
        System.out.println("Creamos una bruja en el mundo 1 " + this.createWitch());

        System.out.println("Cambiamos de mundo, pasamos al Mundo2");
        this.setEnemyAbstractFactory(new World2AbstractFactory());
        System.out.println("Creamos un demonio en el mundo 2 " + this.createDaemon());
        System.out.println("Creamos una bruja en el mundo 2 " + this.createWitch());

        System.out.println("Reiniciamos, pasamos al Mundo1");
        // Volvemos al mundo 1 Creamos enemigos aleatorios
        this.setEnemyAbstractFactory(new World1AbstractFactory());
        for (int i = 0; i < maxEnemies; i++) {
            enemies[i] = this.createEnemy();
            if (enemies[i] instanceof Daemon) {
                daemons++;
            } else {
                witches++;
            }
        }
        System.out.println("Daemons (" + daemons + "), Witches (" + witches + ") proportion of Daemons "
                + 100 * daemons / maxEnemies + " %(rounded)");
        System.out.println("Ejemplo de enemigo aleatorio en el Mundo1" + enemies[0]);

        daemons = 0;
        witches = 0;
        System.out.println("Cambiamos de mundo, pasamos al Mundo2");
        this.setEnemyAbstractFactory(new World2AbstractFactory());
        for (int i = 0; i < maxEnemies; i++) {
            enemies[i] = this.createEnemy();
            if (enemies[i] instanceof Daemon) {
                daemons += 1;
            } else {
                witches += 1;
            }
        }
        System.out.println("Daemons (" + daemons + "), Witches (" + witches + ") proportion of Daemons "
                + 100 * daemons / maxEnemies + " %(rounded)");
        System.out.println("Ejemplo de enemigo aleatorio en el Mundo2" + enemies[0]);
        System.out.println("Juego finalizado");
    }
}
