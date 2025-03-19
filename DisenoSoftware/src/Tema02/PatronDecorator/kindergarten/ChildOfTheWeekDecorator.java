/**
 * Patrón Decorator (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.16
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronDecorator.kindergarten;

import Tema02.PatronObserver.library.Book;

public class ChildOfTheWeekDecorator extends BabyDecorator {

    private Book book; // Libro que recibe el niño de la semana

    public ChildOfTheWeekDecorator(Baby baby, Book book) {
        super(baby);
        this.book = book;
    }

    /**
     * Añade a la descripción el texto de que el niño es "niño/a de la semana"
     * junto con la información del libro.
     */
    @Override
    public String getDescription() {
        return baby.getDescription()
                + "; es niño/a de la semana con libro: "
                + book.toString();
    }

    /**
     * Sobrescribimos para devolver el libro que tiene asociado este decorador.
     */
    @Override
    public Book getBook() {
        return this.book;
    }
}
