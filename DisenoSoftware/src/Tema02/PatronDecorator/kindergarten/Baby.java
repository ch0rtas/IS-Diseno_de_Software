/**
 * Patrón Decorator (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.16
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronDecorator.kindergarten;

import Tema02.PatronObserver.library.Book;

public interface Baby {
    String getName();
    int getAge();
    String getDescription();

    /**
     * Devuelve el libro que tiene el bebé si es "niño de la semana",
     * o null en caso contrario.
     */
    Book getBook();
}
