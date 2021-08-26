package Ubung6.Regale;

public class Buch extends Gegenstand {

    private final String name;

    public Buch(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Buch: " + name;
    }
}
