/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

public class World1Daemon implements Daemon {
    public static final String COLOR_POR_DEFECTO = "rojo";
    private String name;
    private Integer power;
    private Integer lives;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return this.power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getLives() {
        return this.lives;
    }

    public void setLives(Integer lives) {
        this.lives = lives;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public World1Daemon(String name) {
        this(name, World1Daemon.COLOR_POR_DEFECTO);
    }

    public World1Daemon(String name, String color) {
        super();
        this.name = name;
        this.color = color;
        this.power = 10 * World.LEVEL1.getComplexFactor();
        this.lives = 1 * World.LEVEL1.getComplexFactor();
    }

    @Override
    public String toString() {
        return " World1Daemon [name=" + name + ", power=" + power + ", lives=" + lives + ", color=" + color + "]";
    }
}
