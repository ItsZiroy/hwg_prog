package Ubung4.Waehrung;

public class Pfund extends Euro {
    // Euro Kurs
    private static final double kurs = 0.89;

    public Pfund(double wert) {
        super(wert / kurs);
    }

    public Pfund(Euro euro) {
        super(euro.euroBetrag());
    }

    public double waehrungsBetrag() {
        return this.euroBetrag() * kurs;
    }
}
