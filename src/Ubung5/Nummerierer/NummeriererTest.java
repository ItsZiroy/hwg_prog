package Ubung5.Nummerierer;

import Tools.IOTools;

public class NummeriererTest {
    public static void main(String[] args) {
        char mode = IOTools.readChar("Zahlennummeriere (Z) oder Buchstabennummerierer (B) ? ");

        if(mode == 'z' || mode == 'Z') Schilder.beschriften(new ZahlenNummerierer());
        else if(mode == 'B' || mode == 'b') Schilder.beschriften(new BuchstabenNummerierer());

        else {
            System.out.println("Fehlerhafte Eingabe!");
        }

    }
}
