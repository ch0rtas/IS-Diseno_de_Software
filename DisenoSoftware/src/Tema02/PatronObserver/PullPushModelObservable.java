package Tema02.PatronObserver;

public interface PullPushModelObservable {
    void attach(PullPushObserver observer);
    void detach(PullPushObserver observer);
    void notifyObservers();
}
