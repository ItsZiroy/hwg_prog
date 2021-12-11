import Tools.IOTools;

public class Max {
    public static void main(String[] args) {
        String s = IOTools.readString();

        int[] buchstaben = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c < 97 | c > 122) {
                System.out.println("Nur klein erlaubt");
                return;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c -97;
            if(buchstaben[index] != 0) {
                System.out.println(buchstaben[index]);
                return;
            }
            buchstaben[index] = i + 1;
        }
    }
}
