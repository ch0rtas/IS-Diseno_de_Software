/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.03.24
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import Tema02.PatronObserver.library.ModelPullPushObservable;
import Tema02.PatronObserver.library.ModelPullPushObserver;

interface NotificationStrategy {
    void update(ModelPullPushObserver modelObserver,
                ModelPullPushObservable modelObservable,
                Object object);
}