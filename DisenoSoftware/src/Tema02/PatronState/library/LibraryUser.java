package Tema02.PatronState.library;

import Tema02.PatronObserver.library.ModelPullPushObserver;
import Tema02.PatronObserver.library.ModelPullPushObservable;

public class LibraryUser implements ModelPullPushObserver {
    private String name;
    private String address;
    private UserType userType;
    private Boolean activeAccount;

    public LibraryUser(String name, String address, UserType userType, Boolean activeAccount) {
        this.name = name;
        this.address = address;
        this.userType = userType;
        this.activeAccount = activeAccount;
    }

    public String getName() {
        return name;
    }

    public UserType getUserType() {
        return userType;
    }

    public boolean isActiveAccount() {
        return activeAccount;
    }

    @Override
    public void update(ModelPullPushObservable observable, Object object) {
        // Implement notification logic
        if (object != null) {
            System.out.println("Notification for " + name + ": " + object);
        }
    }
}