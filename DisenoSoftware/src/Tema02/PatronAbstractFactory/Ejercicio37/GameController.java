/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

import Tema02.PatronAbstractFactory.Ejercicio37.Daemon;
import Tema02.PatronAbstractFactory.Ejercicio37.Witch;
import Tema02.PatronAbstractFactory.Ejercicio37.EnemyAbstractFactory;
import Tema02.PatronAbstractFactory.Ejercicio37.World1AbstractFactory;
import Tema02.PatronAbstractFactory.Ejercicio37.World2AbstractFactory;

public class GameController {
    private static GameController instance;
    private EnemyAbstractFactory factory;
    private World currentWorld;

    private GameController() {
        this.currentWorld = World.LEVEL1;
        this.factory = new World1AbstractFactory();
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public void play() {
        System.out.println("Empieza el Juego en el Mundo 1\n");

        Daemon daemon1 = factory.createDaemon();
        System.out.println("Creamos un demonio en el mundo 1 " + daemon1);

        Witch witch1 = factory.createWitch();
        System.out.println("Creamos una bruja en el mundo 1 " + witch1);

        this.currentWorld = World.LEVEL2;
        this.factory = new World2AbstractFactory();
        System.out.println("\nCambiamos de mundo");

        Daemon daemon2 = factory.createDaemon();
        System.out.println("Creamos un demonio en el mundo 2 " + daemon2);

        Witch witch2 = factory.createWitch();
        System.out.println("Creamos una bruja en el mundo 2 " + witch2);

        System.out.println("\nJuego finalizado!!");
    }
} 