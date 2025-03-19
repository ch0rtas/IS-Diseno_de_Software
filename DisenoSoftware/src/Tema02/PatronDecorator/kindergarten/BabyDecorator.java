/**
 * Patrón Decorator (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.16
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronDecorator.kindergarten;

import Tema02.PatronObserver.library.Book;

public abstract class BabyDecorator implements Baby {
    protected Baby baby;  // Referencia al componente que decoramos

    public BabyDecorator(Baby baby) {
        this.baby = baby;
    }

    @Override
    public String getName() {
        return baby.getName();
    }

    @Override
    public int getAge() {
        return baby.getAge();
    }

    @Override
    public Book getBook() {
        // Por defecto, delegamos en el decorado
        return baby.getBook();
    }
}
