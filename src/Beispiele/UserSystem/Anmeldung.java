package Beispiele.UserSystem;

public class Anmeldung<T extends User> {

    private T user;

    public Anmeldung(T user) {
        this.user = user;
    }

    public void anmelden() {
        System.out.println("Nutzer " + user.getName() + " meldet sich an");
    }

    public void uebermittleDaten() {
        System.out.println("Nutzer " + user.getName() + " übermittelt Daten");
    }

    public void anServer2anmelden() {
        if(user instanceof Cuser) {
            System.out.println("Anmeldung an privaten Server nicht möglich");
        } else {
            System.out.println("Nutzer " + user.getName() + " meldet sich an");
        }
    }

    public T getUser() {
        return user;
    }
}
