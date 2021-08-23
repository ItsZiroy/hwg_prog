package Ubung5.Nummerierer;

public class ZahlenNummerierer extends Nummerierer {
    private int nummer = 0;

    @Override
    public void reset() {
        nummer = 0;
    }

    @Override
    public String next() {
        if (this.nummer < 20) {
            return "" + ++nummer;
        }
        return "Keine nächste Nummer";
    }

    @Override
    public boolean available() {
        return this.nummer < 20;
    }
}