package Prog1.Ubung5;

import Tools.IOTools;

public class ExceptionFangen {
    public static void main(String[] args) {
        int[] feld = {1,2,3,4};

        for (int i = 0; i < 5; i++) {
            try {
                int index = IOTools.readInt("Geben Sie eine IndexPosition an:");
                System.out.println("feld[" + i + "] = " + feld[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sie haben eine unzulässige Indexposition angegeben");
            }
        }
    }
}
