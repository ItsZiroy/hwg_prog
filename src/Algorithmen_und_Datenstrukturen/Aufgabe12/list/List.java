package Algorithmen_und_Datenstrukturen.Aufgabe12.list;

public interface List<T> {

    void addFirst(T object);

    T getFirst() throws EmptyListException;

    void removeFirst() throws EmptyListException;

    void addLast(T object);

    T getLast() throws EmptyListException;

    void removeLast() throws EmptyListException;

    int size();
}
