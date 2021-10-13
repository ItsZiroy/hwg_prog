package Prog1.Ubung4.Waehrung;

public class Euro {
    /** Ein Euro ist soviel Dollar wert (August 2020) */
    private static double kurs = 1.18;

    /** Instanzvariable: Wert in Euro */
    private double wert;

    /** Konstruktor */
    public Euro(double wert) {
        this.wert = wert;
    }

    /** Gibt den Wert der Waehrung in Dollar zurück */
    public double dollarBetrag() {
        return wert * kurs;
    }

    /** Gibt den Wert der Waehrung in Euro zurück */
    public double euroBetrag() {
        return wert;
    }

    /** Zugriff auf die private Klassenvariable */
    public static void setEuroKurs(double Kurs) {
        kurs = Kurs;
    }

}
