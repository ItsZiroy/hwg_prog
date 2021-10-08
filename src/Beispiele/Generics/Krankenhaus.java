package Beispiele.Generics;

public class Krankenhaus {

    public static <T extends Lebewesen> T makeChild(T vater, T mutter, T kind) {
        vater.kind = kind;
        mutter.kind = kind;
        return kind;
    }

    public static void main(String[] args) {
        Hund peter = new Hund("Peter");
        Hund tom = new Hund("Tom");

        Freundesgruppe<Lebewesen>  gruppe = new Freundesgruppe<Lebewesen>(peter, tom, new Mensch("a"));

    }
}
