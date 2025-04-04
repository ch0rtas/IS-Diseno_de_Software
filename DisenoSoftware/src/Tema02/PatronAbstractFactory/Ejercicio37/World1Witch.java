/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

// Witch para el Mundo 1
public class World1Witch implements Witch {

    private String name;
    private int power;
    private int lives;
    private String magicPower;

    public World1Witch(String name, int power, int lives, String magicPower) {
        this.name = name;
        this.power = power;
        this.lives = lives;
        this.magicPower = magicPower;
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
    public String getMagicPower() {
        return magicPower;
    }

    @Override
    public String toString() {
        return "World1Witch [name=" + name
                + ", power=" + power
                + ", lives=" + lives
                + ", magicPower=" + magicPower + "]";
    }
}
