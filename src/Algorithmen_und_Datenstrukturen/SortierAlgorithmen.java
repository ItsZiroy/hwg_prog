package Algorithmen_und_Datenstrukturen;

import Tools.Generator;
import Tools.Test;

import java.util.Arrays;

public class SortierAlgorithmen {

    public static void insertionSort(int[] array, Orientation orientation) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            if(orientation.equals(Orientation.ASC)) {
                while (j > 0 && array[j - 1] > current) {
                    array[j] = array[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && array[j - 1] < current) {
                    array[j] = array[j - 1];
                    j--;
                }
            }
            array[j] = current;
        }
    }

    public static void selectionSort(int[] array, Orientation orientation) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            int temp = array[i];
            for (int j = i; j < array.length; j++) {
                boolean condition =
                        orientation.equals(Orientation.ASC) ? array[j] < array[min] : array[j] > array[min]; // Vergleichskondition

                if (condition) {
                    min = j;
                }
            }
            array[i] = array[min];
            array[min] = temp;
        }
    }
    public static void bubbleSort(int[] array, Orientation orientation) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                boolean condition =
                        orientation.equals(Orientation.ASC) ? array[i] > array[i + 1] : array[i] < array[i + 1]; // Vergleichskondition
                if(condition) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] bigArray = Generator.intArray(20);

        /*
         * Insertion Sort tests
         */
        Test.info("Testing Insertion Sort ASC.");
        SortierAlgorithmen.insertionSort(bigArray, Orientation.ASC);
        Test.success(Arrays.toString(bigArray));

        Test.info("Testing Insertion Sort DESC.");
        SortierAlgorithmen.insertionSort(bigArray, Orientation.DESC);
        Test.success(Arrays.toString(bigArray));

        /*
         * Selection Sort tests
         */
        Test.info("Testing Selection Sort ASC.");
        SortierAlgorithmen.selectionSort(bigArray, Orientation.ASC);
        Test.success(Arrays.toString(bigArray));

        Test.info("Testing Selection Sort DESC.");
        SortierAlgorithmen.selectionSort(bigArray, Orientation.DESC);
        Test.success(Arrays.toString(bigArray));

        /*
         * Bubble Sort tests
         */
        Test.info("Testing Bubble Sort ASC.");
        SortierAlgorithmen.bubbleSort(bigArray, Orientation.ASC);
        Test.success(Arrays.toString(bigArray));

        Test.info("Testing Bubble Sort DESC.");
        SortierAlgorithmen.bubbleSort(bigArray, Orientation.DESC);
        Test.success(Arrays.toString(bigArray));

    }
}
