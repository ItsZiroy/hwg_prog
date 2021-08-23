package Ubung5.Nummerierer;

public abstract class Nummerierer {
    // Methode zur Herstellung des Anfangszustandes
    // (Nummerierung beginnt wieder von vorne)
    public abstract void reset();
    // Methode, die die jeweils nächste "Nummer" in Form
    // einer Zeichenkette liefert
    public abstract String next();
    // Methode, die anzeigt, ob noch weitere "Nummern"
    // verfügbar sind (true) oder nicht (false)
    public abstract boolean available();
}
