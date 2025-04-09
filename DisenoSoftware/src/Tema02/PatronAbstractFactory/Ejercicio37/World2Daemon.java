/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

public class World2Daemon implements Daemon {

    private String name;
    private int power;
    private int lives;
    private String color;

    public World2Daemon(String name, int power, int lives, String color) {
        this.name = name;
        this.power = power;
        this.lives = lives;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getLives() {
        return lives;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "World2Daemon [name=" + name
                + ", power=" + power
                + ", lives=" + lives
                + ", color=" + color + "]";
    }
}
