package Beispiele.Generics;

public class Freundesgruppe<T extends Lebewesen> {

    Object[] gruppe;

    public Freundesgruppe(T ...gruppe) {
        this.gruppe = gruppe;
    }

    public void setzeAnfuehrer(T anfuehrer) {

        gruppe[0] = anfuehrer;
    }
}
