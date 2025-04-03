/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Estrategia abstracta de notificación push para biblioteca
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

public abstract class LibraryPushNotificationStrategy extends PushNotificationStrategy {
    public abstract void update(LibraryUser libraryUser, LibraryLoanNotification libraryLoanNotification);
}