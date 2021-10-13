package Prog1.Ubung5.Nummerierer;

public class BuchstabenNummerierer extends Nummerierer {
    private char buchstabe = 'A';

    @Override
    public void reset() {
        buchstabe = 'A';
    }

    @Override
    public String next() {
        if (this.available()) {
            return "" + buchstabe++;
        }
        return "Kein nächster Buchstabe";
    }

    @Override
    public boolean available() {
        return this.buchstabe <= 'Z';
    }
}
