package Ubung6.Regale;

public class Regal<T extends Gegenstand> {

    private T gegenstand1;
    private T gegenstand2;
    private T gegenstand3;

    public T getGegenstand1() {
        return gegenstand1;
    }

    public void fuegeHinzu1(T gegenstand1) {
        this.gegenstand1 = gegenstand1;
    }

    public T getGegenstand2() {
        return gegenstand2;
    }

    public void fuegeHinzu2(T gegenstand2) {
        this.gegenstand2 = gegenstand2;
    }

    public T getGegenstand3() {
        return this.gegenstand3;
    }

    public void fuegeHinzu3(T gegenstand3) {
        this.gegenstand3 = gegenstand3;
    }


}
