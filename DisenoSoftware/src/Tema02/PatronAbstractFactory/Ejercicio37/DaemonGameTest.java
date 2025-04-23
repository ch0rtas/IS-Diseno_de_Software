/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

import Tema02.PatronAbstractFactory.demonfactory.GameController;

public class DaemonGameTest {
    public static void main(String[] args) {
        GameController game = GameController.getInstance();
        game.play();
    }
}
