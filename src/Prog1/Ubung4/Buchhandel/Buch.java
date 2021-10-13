package Prog1.Ubung4.Buchhandel;

public class Buch {

    public String titel;
    public int gewicht;
    public double preis;

    public Buch(String titel, int gewicht) {
        this.titel = titel;
        this.gewicht = gewicht;
        this.preis = 9.99;
    }

    public Buch(String titel, int gewicht, double preis) {
        this.titel = titel;
        this.gewicht = gewicht;
        this.preis = preis;
    }

    public void ausgeben() {
        System.out.println("Das Buch " + titel + " kostet " + preis + " EUR und wiegt " + gewicht + " Gramm.");
    }
}
