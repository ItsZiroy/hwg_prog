package Prog1.Autoproduktion;

public class MangelndeMitarbeiterException extends Exception {
    private final int defizit;

    public MangelndeMitarbeiterException(int defizit) {
        this.defizit = defizit;
    }

    @Override
    public String getMessage() {
        return "Der Produktionsstätte fehlen " + Math.abs(defizit) + " Mitarbeiter";
    }

    public int getDefizit() {
        return defizit;
    }
}
