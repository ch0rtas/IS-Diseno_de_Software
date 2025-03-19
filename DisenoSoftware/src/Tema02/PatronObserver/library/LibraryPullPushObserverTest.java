/**
 * Patrón Observer (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.04
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronObserver.library;

public class LibraryPullPushObserverTest {
    public static void main(String[] args) {
        Library library = new Library();

        ModelPullPushObserver stockObserver = new StockDepartmentObserver();
        ModelPullPushObserver adminObserver = new AdminDepartmentObserver();
        ModelPullPushObserver comprasObserver = new ComprasDepartmentObserver();

        library.attachObserver(stockObserver);
        library.attachObserver(adminObserver);
        library.attachObserver(comprasObserver);

        Book bookGood = new Book("Gang of four Design patterns", "Erich Gamma", BookState.GOOD);
        Book bookBad = new Book("Programar sin patrones", "Desconocido", BookState.BAD);

        System.out.println("Alarma notifica bajo protocolo PULL-PUSH");
        library.returnBook(bookGood);  // No debería notificar nada
        library.returnBook(bookBad);  // Notifica a los observadores

        library.detachObserver(comprasObserver);

        System.out.println("Alarma vuelve a notificar bajo protocolo PULL-PUSH");
        Book anotherBookBad = new Book("Programar sin pensar", "Desconocido", BookState.BAD);
        library.returnBook(anotherBookBad);
    }
}
