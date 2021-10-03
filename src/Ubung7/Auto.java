package Ubung7;

public record Auto(String marke, String farbe, String kennzeichen) {

    public Auto(String marke, String kennzeichen) {
        this(marke, "schwarz", kennzeichen);
    }
    public String ermittleLandkreis() {
        return kennzeichen.substring(0, 2);
    }
}
