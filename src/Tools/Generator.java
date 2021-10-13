package Tools;

public class Generator {

    public static int[] intArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        return array;
    }
    public static char[] charArray(int length) {
        char[] array = new char[length];

        for (int i = 0; i < length; i++) {
            array[i] = (char) (Math.random() * 10000);
        }

        return array;
    }

}
