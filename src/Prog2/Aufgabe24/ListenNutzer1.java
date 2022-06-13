package Prog2.Aufgabe24;


import java.util.List;

public class ListenNutzer1 {
    public static void methode() {
        List<String> list = Konfiguration.LIST_ERZEUGER.erzeugeListe();
        list.add("Hallo");
        list.add("Welt");
        System.out.println(list);
        System.out.println(list.getClass().getName());
    }
}
