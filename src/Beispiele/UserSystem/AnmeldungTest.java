package Beispiele.UserSystem;

public class AnmeldungTest {
    public static void main(String[] args) {
        Anmeldung<User> anmeldungDeutschland = new Anmeldung<>(new Cuser("D10200", "DUSER"));

        anmeldungDeutschland.anServer2anmelden();

        System.out.println(anmeldungDeutschland.getUser().uid);

        AnmeldungTest.werteAnmeldungAus(anmeldungDeutschland);
    }

    public static void werteAnmeldungAus(Anmeldung<? super Cuser> anmeldung) {
        anmeldung.getUser();
    }
}
