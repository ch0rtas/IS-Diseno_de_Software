/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

public interface Enemy {
    String getName();
    void setName(String name);
    Integer getPower();
    void setPower(Integer power);
    Integer getLives();
    void setLives(Integer lives);
}
