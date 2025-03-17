package Tema02.PatronObserver;

import java.util.Objects;

/**
 * Patrón Observer (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.04
 * @course INSO 2 - Diseño de Software
 */

public class StockDepartmentObserver implements ModelPullPushObserver {
    @Override
    public void update(ModelPullPushObservable observable, Object object) {
        if (!Objects.isNull(object)) {
            System.out.println("[StockDepartmentObserver Push] se ha devuelto el libro en mal estado " + object);
        } else if (observable instanceof BookAlarm) {
            BookAlarm alarm = (BookAlarm) observable;
            System.out.println("[StockDepartmentObserver Pull] se ha devuelto el libro en mal estado " + alarm.getBook());
        }
    }
}
