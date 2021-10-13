package Algorithmen_und_Datenstrukturen;

import Tools.Generator;

import java.util.Arrays;

public class SuchAlgorithmen {


    /**
     * Sequentielle Suche nach
     * @param array
     * @param s
     * @return
     */
    public static int sequentialSearch(int[] array, int s) {
        int schritte = 0;
        for (int i = 0; i < array.length; i++) {
            schritte = schritte + 2;
            if(array[i] == s) {
                System.out.println("Vergleiche: " + schritte);
                return i;
            }
        }
        System.out.println("Vergleiche: " + ++schritte);
        return -1;
    }

    /**
     * Führt binäre Suche mit absteigend sortiertem Array aus
     * @param array absteigend sortiertes Array
     * @param s gesuchte Zahl
     * @return Index der gesuchten Zahl oder -1
     */
    public static int binarySearch(int[] array, int s) {
        return binarySearch(array, s, Orientation.ASC);
    }
    public static int binarySearch(int[] array, int s, Orientation orientation) {
        int oben = array.length -1, unten = 0, schritte = 0;

        while (oben >= unten) {
            int mitte = (oben + unten) / 2;
            schritte++;
            boolean condition = orientation.equals(Orientation.ASC) ? s > array[mitte] : s < array[mitte];

            if(array[mitte] == s) {
                schritte++;
                System.out.println("Vergleiche: " + schritte);
                return mitte;
            }
            else if(condition) {
                schritte++;
                unten = mitte + 1;
            }
            else {
                schritte++;
                oben = mitte -1;
            }
        }
        System.out.println("Vergleiche: " + ++schritte);
        return -1;
    }

    public static void main(String[] args) {
        int[] bigArray = Generator.intArray(10000);

        System.out.println(SuchAlgorithmen.sequentialSearch(bigArray, 500));

        SortierAlgorithmen.insertionSort(bigArray, Orientation.DESC);
        System.out.println(SuchAlgorithmen.binarySearch(bigArray, 500, Orientation.DESC));

        SortierAlgorithmen.insertionSort(bigArray, Orientation.ASC);
        System.out.println(SuchAlgorithmen.binarySearch(bigArray, 500));

    }
}
