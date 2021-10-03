package Autoproduktion;

public abstract class Autohersteller {
    private String name;
    private String kennzeichner;
    private int registernummer;

    public Autohersteller(String name, String kennzeichner, int registernummer) {
        this.name = name;
        this.kennzeichner = kennzeichner;
        this.registernummer = registernummer;
    }

    public String getName() {
        return name;
    }

    public String getKennzeichner() {
        return kennzeichner;
    }

    public int getRegisternummer() {
        return registernummer;
    }
}
