package Tema02.PatronObserver;

/**
 * Patrón Observer (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.04
 * @course INSO 2 - Diseño de Software
 */


public class StockDepartmentObserver implements PullPushObserver {

    @Override
    public void update(PullPushModelObservable observable, Object arg) {
        // Aseguramos que el observable es del tipo esperado (BookAlarm).
        if (observable instanceof BookAlarm) {
            BookAlarm alarm = (BookAlarm) observable;

            // Prioridad: usar 'arg' (push) si está presente y es un Book.
            if (arg instanceof Book) {
                Book badBook = (Book) arg;
                System.out.println("[StockDepartmentObserver Push] se ha devuelto el libro en mal estado");
                System.out.println(badBook);
            } else {
                // Fallback: protocolo pull.
                Book badBook = alarm.getLastBadBook();
                System.out.println("[StockDepartmentObserver Pull] se ha devuelto el libro en mal estado");
                System.out.println(badBook);
            }
        }
    }
}
