package Prog2.Aufgabe24;


import java.util.ArrayList;
import java.util.List;

public class ArrayListErzeuger implements ListeErzeuger {
    @Override
    public <T> List<T> erzeugeListe() {
        return new ArrayList<T>();
    }
}
