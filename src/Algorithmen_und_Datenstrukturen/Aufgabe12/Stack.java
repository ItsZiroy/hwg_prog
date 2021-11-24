package Algorithmen_und_Datenstrukturen.Aufgabe12;

import Algorithmen_und_Datenstrukturen.Aufgabe12.list.DoubleLinkedList;
import Algorithmen_und_Datenstrukturen.Aufgabe12.stack.StackException;

public class Stack<T> implements Algorithmen_und_Datenstrukturen.Aufgabe12.stack.Stack<T> {

    DoubleLinkedList<T> list = new DoubleLinkedList<>();

    @SafeVarargs
    public Stack(T ...objects) {
        for (T object: objects) {
            this.push(object);
        }
    }
    @Override
    public void push(T object) throws StackException {
        list.addFirst(object);
    }

    @Override
    public void pop() throws StackException {
        if(this.isEmpty()) {
            throw new StackException();
        }
        list.removeFirst();
    }

    @Override
    public T top() throws StackException {
        if(this.isEmpty()) {
            throw new StackException();
        }
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return this.list.size() == 0;
    }
}
