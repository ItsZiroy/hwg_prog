package Prog1.Ubung6;

public enum Wochentag {
    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;

    public boolean istWochenende() {
        return switch (this) {
            case SAMSTAG, SONNTAG -> true;
            default -> false;
        };
    }
/*    public String toString() {
        return this.name().toLowerCase();
    }*/
}
