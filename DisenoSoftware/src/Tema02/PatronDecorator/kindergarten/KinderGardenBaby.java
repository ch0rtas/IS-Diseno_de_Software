/**
 * Patrón Decorator (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.16
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronDecorator.kindergarten;

import Tema02.PatronObserver.library.Book;

public class KinderGardenBaby implements Baby {
    private String name;
    private int age;
    private String nickname; // Opcional, si quieres manejar un nombre alternativo

    // Constructor mínimo
    public KinderGardenBaby(String name, int age) {
        this(name, name, age);
    }

    // Constructor con nombre y apodo
    public KinderGardenBaby(String name, String nickname, int age) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
    }

    @Override
    public String getName() {
        // Si tiene un apodo, lo usamos, si no, el nombre
        return (nickname != null) ? nickname : name;
    }

    @Override
    public int getAge() {
        return age;
    }

    /**
     * Devuelve la descripción "base" del bebé.
     * En el ejemplo del ejercicio, al pasar lista, los niños sin recompensas
     * simplemente se muestran por su nombre.
     */
    @Override
    public String getDescription() {
        return getName();
    }

    /**
     * Por defecto, este bebé no tiene libro (no es niño de la semana).
     */
    @Override
    public Book getBook() {
        return null;
    }
}
