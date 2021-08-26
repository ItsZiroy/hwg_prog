package Ubung6.Regale;

public class CD extends Gegenstand{

    private final String name;

    public CD(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CD: " + name;
    }
}
