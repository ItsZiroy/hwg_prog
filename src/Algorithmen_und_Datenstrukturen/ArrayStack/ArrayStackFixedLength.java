package Algorithmen_und_Datenstrukturen.ArrayStack;

import java.util.Arrays;

public class ArrayStackFixedLength<T> implements Stack<T> {

    public Object[] getArray() {
        return array;
    }
    private int currentIndex = -1;

    private Object[] array;

    public ArrayStackFixedLength(int length, int... values) throws StackException {
        array =  new Object[length];
        int i = 0;
        if(values.length > length) throw new StackException();
        for(int v: values) {
            array[i] = values;
            i++;
        }

    }
    public ArrayStackFixedLength(int length) {
        array =  new Object[length];
    }
    public ArrayStackFixedLength() {
        array =  new Object[10];
    }

    public static void main(String[] args) {

        ArrayStackFixedLength<Integer> s = new ArrayStackFixedLength<>(3);

        System.out.println(s.isEmpty());

        s.push(1);
        s.push(4);
        s.push(6);

        System.out.println(Arrays.toString(s.getArray()));
        System.out.println(s.top());

        s.pop();
        s.pop();
        s.pop();

        System.out.println(s.isEmpty());
    }


    @Override
    public void push(T object) throws StackException {
        if(currentIndex + 1 == array.length) {
            throw new StackException();
        }
        this.currentIndex++;
        this.array[currentIndex] = object;
    }

    @Override
    public void pop() throws StackException {
        if(currentIndex == -1) {
            throw new StackException();
        }
        this.array[currentIndex] = null;

        this.currentIndex--;
    }

    @Override
    public T top() throws StackException {
        if(currentIndex == -1) {
            throw new StackException();
        }
        return (T) this.array[currentIndex];
    }

    @Override
    public boolean isEmpty() {
        return currentIndex == -1;
    }
}
