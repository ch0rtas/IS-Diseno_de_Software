/**
 * Patrón Abstract Factory (Tema 02) - Demon Factory
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronAbstractFactory.Ejercicio37;

public enum World {
    LEVEL1(1),
    LEVEL2(2);

    private int complexFactor;

    private World(int complexFactor) {
        this.complexFactor = complexFactor;
    }

    public int getComplexFactor() {
        return complexFactor;
    }
}
