package Prog2.Aufgabe25;

public class RechenServiceNutzer {
    public static void main(String[] args) {
        RechenService service = new RechenServiceImpl();
        RechenService proxy = new RechenServiceProxy();

        System.out.println(service.fakultaet(3));
        System.out.println(proxy.fakultaet(3));
        System.out.println(proxy.fakultaet(3));
    }
}
