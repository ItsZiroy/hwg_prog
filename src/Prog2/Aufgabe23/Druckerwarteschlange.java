package Prog2.Aufgabe23;


import java.util.LinkedList;
import java.util.Queue;


public final class Druckerwarteschlange {
    static Druckerwarteschlange druckerwarteschlange;

    Queue<String> jobs = new LinkedList<>();
    private Druckerwarteschlange() {};

    public static Druckerwarteschlange getInstance() {
        if(druckerwarteschlange == null) {
            druckerwarteschlange = new Druckerwarteschlange();
        }
        return druckerwarteschlange;
    }

    public String removeFirstEntry() {
        if(jobs.isEmpty()) return null;
        return jobs.remove();
    }

    public void addEntry(String s) {
        jobs.add(s);
    }

    @Override
    public String toString() {
        return jobs.toString();
    }
}
