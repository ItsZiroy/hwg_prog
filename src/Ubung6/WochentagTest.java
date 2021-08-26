package Ubung6;

public class WochentagTest {
    public static void main(String[] args) {
        for (Wochentag tag: Wochentag.values()) {
            String wochenende = tag.istWochenende() ? "" : " kein";
            System.out.println("Am " + tag + " (Ordinalzahl " + tag.ordinal() + ") ist" + wochenende + " Wochenende.");
        }
    }
}
