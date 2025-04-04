package Tema02.PatronAbstractFactory.demonfactory;

// Importamos las clases necesarias del ejercicio anterior
import Tema02.PatronAbstractFactory.Ejercicio37.World;
import Tema02.PatronAbstractFactory.Ejercicio37.EnemyAbstractFactory;
import Tema02.PatronAbstractFactory.Ejercicio37.World1Factory;
import Tema02.PatronAbstractFactory.Ejercicio37.World2Factory;
import Tema02.PatronAbstractFactory.Ejercicio37.Daemon;
import Tema02.PatronAbstractFactory.Ejercicio37.Witch;

import java.util.Random;

/**
 * GameController
 *
 * Componentes:
 * - Singleton pattern (objeto único): El atributo static instance y el método getInstance().
 * - Abstract Factory pattern: Uso de la interfaz EnemyAbstractFactory y sus implementaciones World1Factory y World2Factory.
 *
 * El método play simula la creación de enemigos de forma aleatoria en dos mundos con diferentes
 * probabilidades y muestra mensajes informativos en consola.
 */
public class GameController {

    // Singleton: instancia única del controlador del juego
    private static GameController instance;

    private EnemyAbstractFactory factory;
    private World currentWorld;
    private Random random;

    // Constructor privado para garantizar el Singleton
    private GameController() {
        // Configuración inicial en Mundo 1 (World.LEVEL1) con World1Factory
        this.currentWorld = World.LEVEL1;
        this.factory = new World1Factory();
        this.random = new Random();
    }

    /**
     * Método que devuelve la única instancia de GameController (Singleton).
     */
    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    /**
     * Método play. Realiza lo siguiente:
     * - Muestra mensajes de inicio y cambio de mundo.
     * - Crea ejemplos fijos de demonio y bruja en cada mundo.
     * - Realiza una simulación (100 iteraciones) de creación aleatoria de enemigos:
     *      * En Mundo1, enemigos equiprobables.
     *      * En Mundo2, 30% probabilidad de demonio y 70% de bruja.
     * - Muestra la proporción y un ejemplo aleatorio de enemigo generado para cada mundo.
     */
    public void play() {
        // Inicio del juego en Mundo1
        System.out.println("Empieza el juego en el Mundo 1");

        // Usamos la factory para Mundo1 (Abstract Factory pattern)
        Daemon daemonWorld1 = factory.createDaemon();
        Witch witchWorld1 = factory.createWitch();
        System.out.println("Creamos un demonio en el mundo 1 " + daemonWorld1);
        System.out.println("Creamos una bruja en el mundo 1 " + witchWorld1);

        // Cambiamos a Mundo2
        System.out.println("Cambiamos de mundo, pasamos al Mundo2");
        this.currentWorld = World.LEVEL2;
        this.factory = new World2Factory();
        Daemon daemonWorld2 = factory.createDaemon();
        Witch witchWorld2 = factory.createWitch();
        System.out.println("Creamos un demonio en el mundo 2 " + daemonWorld2);
        System.out.println("Creamos una bruja en el mundo 2 " + witchWorld2);

        // Simulación: generación aleatoria de enemigos en Mundo1 (equiprobable)
        int iterations = 100;
        int countDaemonWorld1 = 0;
        int countWitchWorld1 = 0;
        // Nueva instancia de factory para Mundo1
        EnemyAbstractFactory world1Factory = new World1Factory();
        for (int i = 0; i < iterations; i++) {
            // Selección equiprobable: 0 => demonio, 1 => bruja
            if (random.nextInt(2) == 0) {
                countDaemonWorld1++;
            } else {
                countWitchWorld1++;
            }
        }
        int percentageWorld1 = (int) Math.round((countDaemonWorld1 / (double) iterations) * 100);
        System.out.println("Reiniciamos, pasamos al Mundo1");
        System.out.println("Daemons (" + countDaemonWorld1 + "), Witches (" + countWitchWorld1 +
                ") proportion of Daemons " + percentageWorld1 + " %(rounded)");

        // Ejemplo de enemigo aleatorio en Mundo1
        Object randomEnemyWorld1;
        if (random.nextInt(2) == 0) {
            randomEnemyWorld1 = world1Factory.createDaemon();
        } else {
            randomEnemyWorld1 = world1Factory.createWitch();
        }
        System.out.println("Ejemplo de enemigo aleatorio en el Mundo1 " + randomEnemyWorld1);

        // Simulación: generación aleatoria de enemigos en Mundo2 (30% demonio, 70% bruja)
        int countDaemonWorld2 = 0;
        int countWitchWorld2 = 0;
        // Nueva instancia de factory para Mundo2
        EnemyAbstractFactory world2Factory = new World2Factory();
        for (int i = 0; i < iterations; i++) {
            // 30% probabilidad para demonio (número aleatorio entre 0 y 99 menor que 30)
            if (random.nextInt(100) < 30) {
                countDaemonWorld2++;
            } else {
                countWitchWorld2++;
            }
        }
        int percentageWorld2 = (int) Math.round((countDaemonWorld2 / (double) iterations) * 100);
        System.out.println("Cambiamos de mundo, pasamos al Mundo2");
        System.out.println("Daemons (" + countDaemonWorld2 + "), Witches (" + countWitchWorld2 +
                ") proportion of Daemons " + percentageWorld2 + " %(rounded)");

        // Ejemplo de enemigo aleatorio en Mundo2
        Object randomEnemyWorld2;
        if (random.nextInt(100) < 30) {
            randomEnemyWorld2 = world2Factory.createDaemon();
        } else {
            randomEnemyWorld2 = world2Factory.createWitch();
        }
        System.out.println("Ejemplo de enemigo aleatorio en el Mundo2 " + randomEnemyWorld2);

        System.out.println("Juego finalizado");
    }
}
