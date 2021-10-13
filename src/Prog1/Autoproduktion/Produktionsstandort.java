package Prog1.Autoproduktion;

public class Produktionsstandort {

    private ProduktionsTeil[] teile = new ProduktionsTeil[0];
    private final String standort;
    private int mitarbeiter;
    private int verfuegbareMitarbeiter;

    public Produktionsstandort(String standort, int mitarbeiter) {
        this.standort = standort;
        this.mitarbeiter = mitarbeiter;
        this.verfuegbareMitarbeiter = mitarbeiter;
    }
    public Produktionsstandort(String standort) {
        this.standort = standort;
        this.mitarbeiter = 100;
        this.verfuegbareMitarbeiter = this.mitarbeiter;
    }

    public Kleinteil[] getProduzierteTeile() {
        return this.teile;
    }

    public void addProduziertesTeil(Kleinteil pKleinteil) {
        ProduktionsTeil[] newArray = new ProduktionsTeil[this.teile.length + 1];
        for (int i = 0; i < this.teile.length ; i++) {
            newArray[i] = this.teile[i];
        }
        newArray[this.teile.length] = new ProduktionsTeil(pKleinteil);

        this.teile = newArray;
    }

    public String getProduktionsStandort() {
        return this.standort;
    }

    public boolean kannProduziertWerden(Kleinteil pKleinteil) {
        return findeTeil(pKleinteil) != null;
    }

    public boolean kannProduktionStarten(Komponente pKomponente) {
        if(this.verfuegbareMitarbeiter < pKomponente.benoetigteMitarbeiter()) return false;
            for (Kleinteil teil: pKomponente.getKomponenten()) {
                if(!this.kannProduziertWerden(teil)) return false;
            }

        return true;
    }

    private ProduktionsTeil findeTeil(Kleinteil pKleinteil) {
        for (ProduktionsTeil teil: this.teile) {
            if(teil.istGleichesTeil(pKleinteil)) return teil;
        }
        return null;
    }

    public int getVerfuegbareMitarbeiter() {
        return verfuegbareMitarbeiter;
    }
    public void starteProduktion(Komponente pKomponente) throws MangelndeMitarbeiterException {
        if(pKomponente.benoetigteMitarbeiter() < this.verfuegbareMitarbeiter) {
            for (Kleinteil kleinTeil: pKomponente.getKomponenten()) {
                ProduktionsTeil teil = this.findeTeil(kleinTeil);
                if(teil != null) {
                    this.verfuegbareMitarbeiter -= teil.getBenoetigteArbeiter();
                    teil.setInProduktion(false);
                }
            }
        } else {
            throw new MangelndeMitarbeiterException(this.verfuegbareMitarbeiter - pKomponente.benoetigteMitarbeiter());
        }
    }
    public boolean istInProduktion(Kleinteil pKleinteil) {
        ProduktionsTeil gefundenesTeil = this.findeTeil(pKleinteil);
        if(gefundenesTeil != null) {
            return gefundenesTeil.istInProduktion();
        }
        return false;
    }

    public void beendeProuktion(Kleinteil pKleinteil) {
        ProduktionsTeil teil = this.findeTeil(pKleinteil);
        if(teil != null) {
            if(teil.istInProduktion()) {
                this.verfuegbareMitarbeiter += teil.getBenoetigteArbeiter();
                teil.setInProduktion(false);
            }
        }
    }

    public void addMitarbeiter(int anzahl) {
        this.mitarbeiter += anzahl;
    }

    public int getMitarbeiter() {
        return this.mitarbeiter;
    }
}
