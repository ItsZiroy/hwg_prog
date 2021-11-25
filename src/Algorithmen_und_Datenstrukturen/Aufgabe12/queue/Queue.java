package Algorithmen_und_Datenstrukturen.Aufgabe12.queue;

public interface Queue<T> {

    void enter(T object) throws QueueException;

    void leave() throws QueueException;

    T front() throws QueueException;

    boolean isEmpty();
}
