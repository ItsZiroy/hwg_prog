package Prog2.Aufgabe24;

import java.util.LinkedList;
import java.util.List;

public class LinkedListErzeuger implements ListeErzeuger{
    @Override
    public <T> List<T> erzeugeListe() {
        return new LinkedList<T>();
    }
}
