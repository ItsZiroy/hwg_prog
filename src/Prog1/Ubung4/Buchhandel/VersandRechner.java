package Prog1.Ubung4.Buchhandel;

public class VersandRechner {
    public static double berechneVersandkosten(Buch[] buecher) {
        int gesamtgewicht = 0;

        for (Buch buch: buecher) {
            gesamtgewicht += buch.gewicht;
        }

        if(gesamtgewicht < 250) return 2.95;
        if(gesamtgewicht < 500) return 3.99;
        if(gesamtgewicht < 1000) return 6.50;

        return 12.00;
    }
}
