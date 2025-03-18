package Tema02.PatronDecorator.kindergarten;

/**
 * Patrón Decorator (Tema 02) - Ejercicio Guardería
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.16
 * @course INSO 2 - Diseño de Software
 */


import Tema02.PatronObserver.library.Book;
import Tema02.PatronObserver.library.BookState;

public class KinderGardenDecoratorTest {

    public static void main(String[] args) {
        // Creamos la guardería y el libro de ejemplo
        KinderGarden kinderGarden = new KinderGarden();
        Book book = new Book("Desing patterns", "Gang of four", BookState.GOOD);

        // Creamos dos bebés: Kike e Inés
        KinderGardenBaby ines = new KinderGardenBaby("Inés", 1);
        KinderGardenBaby kike = new KinderGardenBaby("Enrioque", "Kike", 2);

        // Añadimos los bebés a la guardería
        kinderGarden.getBabies().add(kike);
        kinderGarden.getBabies().add(ines);

        // 1) Primera pasada de lista
        kinderGarden.checkBabies(); // "Kike" / "Inés"

        // TODO: Inés recibe el certificado de buena conducta
        Baby decoratedInes = new GoodBehaviorDecorator(ines);
        // Reemplazamos en la lista el objeto Inés por su versión decorada
        kinderGarden.getBabies().set(kinderGarden.getBabies().indexOf(ines), decoratedInes);

        // 2) Segunda pasada de lista
        kinderGarden.checkBabies();
        // "Kike"
        // "Inés con premio de buena conducta pañal"

        // TODO: Inés vuelve a recibir el premio de la semana (libro)
        Baby childOfWeekInes = new ChildOfTheWeekDecorator(decoratedInes, book);
        kinderGarden.getBabies().set(
                kinderGarden.getBabies().indexOf(decoratedInes),
                childOfWeekInes
        );

        // 3) Tercera pasada de lista
        kinderGarden.checkBabies();
        // "Kike"
        // "Inés con premio de buena conducta pañal  es niño de la semana con libro: Book [title=Desing patterns, author=Gang of four, bookState=GOOD]"

        // Finalmente, comprobamos si Inés tiene libro y mostramos el título
        if (childOfWeekInes.getBook() != null) {
            System.out.println(childOfWeekInes.getName()
                    + " tiene el libro: "
                    + childOfWeekInes.getBook().getTitle());
        }
    }
}
