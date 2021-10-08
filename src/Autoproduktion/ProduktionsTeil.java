package Autoproduktion;

public class ProduktionsTeil extends Kleinteil {

    private boolean inProduktion = false;

    public ProduktionsTeil(Kleinteil kleinTeil) {
        super(kleinTeil.getName(), kleinTeil.getBenoetigteArbeiter());
    }

    public boolean istInProduktion() {
        return this.inProduktion;
    }

    public void setInProduktion(boolean inProduktion) {
        this.inProduktion = inProduktion;
    }
}
