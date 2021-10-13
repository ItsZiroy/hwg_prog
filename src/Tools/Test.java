package Tools;

public class Test {
    public static void info(String message) {
        System.out.println(Colors.ANSI_CYAN + message);
    }
    public static void error(String message) {
        System.out.println(Colors.ANSI_RED + message);
    }
    public static void error() {
        System.out.println(Colors.ANSI_RED + "Test fehlgeschlagen");
    }
    public static void success(String message) {
        System.out.println(Colors.ANSI_GREEN + message);
    }
    public static void success() {
        System.out.println(Colors.ANSI_GREEN + "Test bestanden");
    }
}
