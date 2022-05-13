package Prog2.Aufgabe20;

public record Student(Integer matrikelNr, String vorname, String nachname) {
    @Override
    public String toString() {
        return vorname + " " + nachname + "(" +matrikelNr + ")";
    }
}