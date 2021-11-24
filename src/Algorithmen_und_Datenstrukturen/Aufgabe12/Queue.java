package Algorithmen_und_Datenstrukturen.Aufgabe12;

import Algorithmen_und_Datenstrukturen.Aufgabe12.list.DoubleLinkedList;
import Algorithmen_und_Datenstrukturen.Aufgabe12.queue.QueueException;

public class Queue<T> implements Algorithmen_und_Datenstrukturen.Aufgabe12.queue.Queue<T> {

    private final DoubleLinkedList<T> list = new DoubleLinkedList<T>();

    @SafeVarargs
    public Queue(T ...objects) {
        for (T object: objects) {
            this.enter(object);
        }
    }

    @Override
    public void enter(T object) throws QueueException {
        list.addLast(object);
    }

    @Override
    public void leave() throws QueueException {
        if(this.isEmpty()) {
            throw new QueueException();
        }
        list.removeFirst();
    }

    @Override
    public T front() throws QueueException {
        if(this.isEmpty()) {
            throw new QueueException();
        }
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }
}
