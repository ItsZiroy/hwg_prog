package Autoproduktion;

public class Komponente implements Teil<Komponente>{

    private String name;

    private final Kleinteil[] komponenten;

    public Komponente(String name, Kleinteil[] komponenten) {
        this.name = name;
        this.komponenten = komponenten;
    }

    @Override
    public boolean istGleichesTeil(Komponente teil) {
        int gleicheTeile = 0;
        for (Kleinteil komponente: this.komponenten) {
            for (Kleinteil andereKomponente: teil.getKomponenten()) {
                if(komponente.istGleichesTeil(andereKomponente)) gleicheTeile++;
            }
        }
        return gleicheTeile == komponenten.length;
    }

    public Kleinteil[] getKomponenten() {
        return komponenten;
    }

    public int benoetigteMitarbeiter() {
        int mitarbeiter = 0;
        for (Kleinteil komponente: this.komponenten) {
            mitarbeiter += komponente.getBenoetigteArbeiter();
        }
        return mitarbeiter;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
