package Tema02.PatronObserver;

public interface PullPushObserver {
    // El 'observable' es el sujeto que notifica,
    // y 'arg' es la variable de estado enviada por push (puede ser null).
    void update(PullPushModelObservable observable, Object arg);
}
