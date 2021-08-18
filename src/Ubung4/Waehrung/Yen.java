package Ubung4.Waehrung;

public class Yen extends Euro {
    // Euro Kurs
    private static final double kurs = 124.75;

    public Yen(double wert) {
        super(wert / kurs);
    }
    public Yen(Euro euro) {
        super(euro.euroBetrag());
    }

    public double waehrungsBetrag() {
        return this.euroBetrag() * kurs;
    }
}
