package Prog2.Aufgabe24;


import java.util.List;

public class ListenNutzer2 {
    public static void methode() {
        List<Integer> list = Konfiguration.LIST_ERZEUGER.erzeugeListe();
        list.add(1);
        list.add(2);
        System.out.println(list);
        System.out.println(list.getClass().getName());
    }
}
