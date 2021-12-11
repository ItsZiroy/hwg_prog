package Beispiele;

public record Auto(String kennzeichen, String farbe) {
    public Auto(String kennzeichen) {
        this(kennzeichen, "schwarz");
    }
}
