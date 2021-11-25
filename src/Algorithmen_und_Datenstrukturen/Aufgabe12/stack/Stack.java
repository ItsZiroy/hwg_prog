package Algorithmen_und_Datenstrukturen.Aufgabe12.stack;

public interface Stack<T> {

    void push(T object) throws StackException;

    void pop() throws StackException;

    T top() throws StackException;

    boolean isEmpty();
}
