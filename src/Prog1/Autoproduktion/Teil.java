package Prog1.Autoproduktion;

public interface Teil<T> {
    boolean istGleichesTeil(T teil);
    String getName();
}
