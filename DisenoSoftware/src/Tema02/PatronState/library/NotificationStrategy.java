package Tema02.PatronState.library;

import Tema02.PatronObserver.library.ModelPullPushObservable;
import Tema02.PatronObserver.library.ModelPullPushObserver;

interface NotificationStrategy {
    void update(ModelPullPushObserver modelObserver,
                ModelPullPushObservable modelObservable,
                Object object);
}