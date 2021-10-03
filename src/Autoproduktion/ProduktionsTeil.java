package Autoproduktion;

public class ProduktionsTeil extends Kleinteil {

    private boolean inProduktion;

    public ProduktionsTeil(Kleinteil kleinTeil) {
        super(kleinTeil.getName(), kleinTeil.getBenoetigteArbeiter());
    }

    public boolean isInProduktion() {
        return inProduktion;
    }

    public void setInProduktion(boolean inProduktion) {
        this.inProduktion = inProduktion;
    }
}
