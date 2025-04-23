/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

public class World1Witch implements Witch {
    public static final String MAGIC_POWER_POR_DEFECTO = "Magic wand";
    private String name;
    private Integer power;
    private Integer lives;
    private String magicPower;

    public String getName() {
        return this.name;
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

    public String getMagicPower() {
        return this.magicPower;
    }

    public void setMagicPower(String magicPower) {
        this.magicPower = magicPower;
    }

    public World1Witch(String name) {
        this(name, World1Witch.MAGIC_POWER_POR_DEFECTO);
    }

    public World1Witch(String name, String magicPower) {
        super();
        this.name = name;
        this.magicPower = magicPower;
        this.power = 15 * World.LEVEL1.getComplexFactor();
        this.lives = 2 * World.LEVEL1.getComplexFactor();
    }

    @Override
    public String toString() {
        return " World1Witch [name=" + name + ", power=" + power + ", lives=" + lives + ", magicPower=" + magicPower + "]";
    }
}
