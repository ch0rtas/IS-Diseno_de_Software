/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Estrategia de notificación push
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import Tema02.PatronObserver.library.ModelPullPushObserver;
import Tema02.PatronObserver.library.ModelPullPushObservable;

public class PushNotificationStrategy implements NotificationStrategy {
    public void update(ModelPullPushObserver modelObserver, ModelPullPushObservable modelObservable, Object object) {
        modelObserver.update(modelObservable, object);
    }
}