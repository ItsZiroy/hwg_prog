package Algorithmen_und_Datenstrukturen.Aufgabe12.list;

public class DoubleLinkedList<T> implements List<T> {

    private class Node {

        private final T object;
        private Node next;
        private Node previous;

        Node(T object) {
            this.object = object;
        }
    }

    private Node head;
    private Node tail;

    @Override
    public void addFirst(T object) {
        Node newNode = new Node(object);

        if (head == null) {
            // Liste ist leer
            head = newNode;
            tail = newNode;
        } else {
            // Liste enthält mindestens ein Element
            newNode.next = head;
            head = newNode;
            newNode.next.previous = newNode;
        }
    }

    @Override
    public T getFirst() throws EmptyListException {
        if (head == null) {
            // Liste ist leer
            throw new EmptyListException();
        } else {
            // Liste enthält mindestens ein Element
            return head.object;
        }
    }

    @Override
    public void removeFirst() throws EmptyListException {
        if (head == null) {
            // Liste ist leer
            throw new EmptyListException();
        } else {
            if (head.next == null) {
                // Liste enthält genau ein Element
                head = null;
                tail = null;
            } else {
                // Liste enthält mindestens zwei Elemente
                head = head.next;
                head.previous = null;
            }
        }
    }

    @Override
    public void addLast(T object) {
        Node newNode = new Node(object);

        if (tail == null) {
            // Liste ist leer
            head = newNode;
            tail = newNode;
        } else {
            // Liste enthält mindestens ein Element
            newNode.previous = tail;
            tail = newNode;
            newNode.previous.next = newNode;
        }
    }

    @Override
    public T getLast() throws EmptyListException {
        if (tail == null) {
            // Liste ist leer
            throw new EmptyListException();
        } else {
            // Liste enthält mindestens ein Element
            return tail.object;
        }
    }

    @Override
    public void removeLast() throws EmptyListException {
        if (tail == null) {
            // Liste ist leer
            throw new EmptyListException();
        } else {
            if (tail.previous == null) {
                // Liste enthält genau ein Element
                head = null;
                tail = null;
            } else {
                // Liste enthält mindestens zwei Elemente
                tail = tail.previous;
                tail.next = null;
            }
        }
    }

    @Override
    public int size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }
}
