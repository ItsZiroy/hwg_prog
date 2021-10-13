package Prog1.Autoproduktion;


public class Kleinteil implements Teil<Kleinteil> {

    private final String name;
    private final int arbeiter;

    public Kleinteil(String name, int arbeiter) {
        this.name = name;
        this.arbeiter = arbeiter;
    }

    public String getName() {
        return name;
    }

    public int getBenoetigteArbeiter() {
        return this.arbeiter;
    }

    public boolean istGleichesTeil(Kleinteil teil) {
        return this.name.equals(teil.name) && this.arbeiter == teil.getBenoetigteArbeiter();
    }

}
