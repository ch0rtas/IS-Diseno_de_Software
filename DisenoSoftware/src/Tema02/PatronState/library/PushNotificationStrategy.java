package Tema02.PatronState.library;

import Tema02.PatronObserver.library.ModelPullPushObservable;
import Tema02.PatronObserver.library.ModelPullPushObserver;

public class PushNotificationStrategy implements NotificationStrategy {
    @Override
    public void update(ModelPullPushObserver modelObserver,
                       ModelPullPushObservable modelObservable,
                       Object object) {
        modelObserver.update(null, object);
    }
}