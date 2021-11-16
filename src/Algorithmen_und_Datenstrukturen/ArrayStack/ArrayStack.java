package Algorithmen_und_Datenstrukturen.ArrayStack;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {

    public Object[] getArray() {
        return array;
    }

    private Object[] array = new Object[0];

    public static void main(String[] args) {

        ArrayStack<Integer> s = new ArrayStack<Integer>();

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
        Object[] newArray = new Object[array.length + 1];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = this.array[i];
        }
        newArray[array.length] = object;
        this.array = newArray;
    }

    @Override
    public void pop() throws StackException {
        if(this.array.length == 0) throw new StackException();

        Object[] newArray = new Object[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    @Override
    public T top() throws StackException {
        if(this.array.length == 0) throw new StackException();
        return (T) this.array[array.length -1];
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }
}
