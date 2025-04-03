/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Interface para estrategias de notificación
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import Tema02.PatronObserver.library.ModelPullPushObserver;
import Tema02.PatronObserver.library.ModelPullPushObservable;

public interface NotificationStrategy {
    public void update(ModelPullPushObserver modelObserver, ModelPullPushObservable modelObservable, Object object);
}