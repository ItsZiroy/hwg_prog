package Prog1.Konstruktoren;

/**
 *
 * Reihenfolge:
 * 1. IMMER ERST SUPER - und alle dessen Prog1.Autoproduktion.Konstruktoren (rekursiv)
 *    - d.H. es wird immer erst die komplette Vererbung hochgegangen wie in ner rekursiven Methode
 *
 * 2. Dann Initialisierung der Variablen (Klassen variablen werden nur EINMAL initialisiert)
 * 3. Abarbeitung des eigenen Constructors
 *
 *
 *
 */
public class Hund extends Katze{

    Maus maus = new Maus(); // maus = null

    public Hund() {
        // Super Konstruktor
        this(1);

        System.out.println("Hund");
    }

    public Hund(int i) {
        System.out.println("Hund2");
    }

    public static void main(String[] args) {
        Hund hund = new Hund();
    }
}
