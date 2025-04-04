/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

public class GameController {

    private static GameController instance;
    private EnemyAbstractFactory factory;
    private World currentWorld;

    // Constructor privado para Singleton
    private GameController() {
        // Configuración inicial:
        this.currentWorld = World.LEVEL1;
        this.factory = new World1Factory(); // Fábrica para Mundo 1 por defecto
    }

    // Singleton
    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public void play() {
        // Empieza el juego en Mundo 1
        System.out.println("Empieza el Juego en el Mundo 1\n");

        // Creamos un demonio en Mundo 1
        Daemon daemon1 = factory.createDaemon();
        System.out.println("Creamos un demonio en el mundo 1 " + daemon1);

        // Creamos una bruja en Mundo 1
        Witch witch1 = factory.createWitch();
        System.out.println("Creamos una bruja en el mundo 1 " + witch1);

        // Cambiamos a Mundo 2
        this.currentWorld = World.LEVEL2;
        this.factory = new World2Factory();
        System.out.println("\nCambiamos de mundo");

        // Creamos un demonio en Mundo 2
        Daemon daemon2 = factory.createDaemon();
        System.out.println("Creamos un demonio en el mundo 2 " + daemon2);

        // Creamos una bruja en Mundo 2
        Witch witch2 = factory.createWitch();
        System.out.println("Creamos una bruja en el mundo 2 " + witch2);

        // Mensaje final
        System.out.println("\nJuego finalizado!!");
    }
}
