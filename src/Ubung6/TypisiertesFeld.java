package Ubung6;

public class TypisiertesFeld<T> {

    private final Object[] feld;

    private int freierIndex = 0;

    public TypisiertesFeld(int i) {
        this.feld = new Object[i];
    }

    public void add(T objekt) {
        if(freierIndex < feld.length) {
            this.feld[freierIndex++] = objekt;
        }
    }

    public T get(int index) {
        if(index < this.feld.length) {
            return (T) this.feld[index];
        }
        return null;
    }

    public int length() {
        return freierIndex;
    }

    public static void main(String[] args) {
        TypisiertesFeld<Wochentag> typisiertesFeld = new TypisiertesFeld<>(4);
        typisiertesFeld.add(Wochentag.MONTAG);
        typisiertesFeld.add(Wochentag.DIENSTAG);
        typisiertesFeld.add(Wochentag.DIENSTAG);

        Wochentag g = typisiertesFeld.get(3);
        System.out.println(g);
        System.out.println(typisiertesFeld.length());
    }
}
