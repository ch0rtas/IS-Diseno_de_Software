package Tema02.PatronAbstractFactory.demonfactory;

/**
 * DaemonGameTest
 *
 * Clase de prueba para acceder al objeto único GameController usando el patrón Singleton.
 * Se completa la línea de instanciación con GameController.getInstance() y se llama al método play().
 */
public class DaemonGameTest {
    public static void main(String[] args) {
        // Accede al objeto único aplicando el patrón Singleton
        GameController game = GameController.getInstance();
        game.play();
    }
}
