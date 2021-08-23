package ZugriffTest;

public class Gamma extends Alpha {
    public int a;

    public Gamma() {
        this.a = 10; // Ohne Initialisierung = 0;
        // System.out.println(super.integer());
    }

    @Override
    public int integer() {
        return this.a;
    }

    public static void main(String[] args) {
        Gamma g = new Gamma();
        System.out.println(g.integer());
        System.out.println(g.a);
    }
}
