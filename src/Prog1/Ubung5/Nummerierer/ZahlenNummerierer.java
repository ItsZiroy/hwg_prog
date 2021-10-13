package Prog1.Ubung5.Nummerierer;

public class ZahlenNummerierer extends Nummerierer {
    private int nummer = 0;

    @Override
    public void reset() {
        nummer = 0;
    }

    @Override
    public String next() {
        if (this.available()) {
            return "" + ++nummer;
        }
        return "Keine nächste Nummer";
    }

    @Override
    public boolean available() {
        return this.nummer < 20;
    }
}
