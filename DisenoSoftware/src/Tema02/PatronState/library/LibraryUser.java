/**
 * Patrón State (Tema 02) - Ejercicio Biblioteca
 *
 * Usuario de biblioteca sujeto a recibir notificaciones
 *
 * @author Manuel Martínez Ramón
 * @date 2025.04.02
 * @course INSO 2 - Diseño de Software
 */
package Tema02.PatronState.library;

import Tema02.PatronObserver.library.ModelPullPushObservable;
import Tema02.PatronObserver.library.ModelPullPushObserver;

public class LibraryUser implements ModelPullPushObserver {
    private String name;
    private String address;
    private UserType userType;
    private Boolean activeAccount;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserType getUserType() {
        return this.userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Boolean getActiveAccount() {
        return this.activeAccount;
    }

    public void setActiveAccount(Boolean activeAccount) {
        this.activeAccount = activeAccount;
    }

    public LibraryUser(String name, String address, UserType userType, Boolean activeAccount) {
        super();
        this.name = name;
        this.address = address;
        this.userType = userType;
        this.activeAccount = activeAccount;
    }

    public void update(ModelPullPushObservable observable, Object object) {
        System.out.println(object);
    }
}