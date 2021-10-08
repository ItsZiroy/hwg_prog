package Beispiele;

public class NennerNullException extends Throwable {

    public String id;

    public NennerNullException(String id) {
        this.id = id;
    }
    @Override
    public String getMessage() {
        return "Nenner darf nicht 0 sein.";
    }
}
