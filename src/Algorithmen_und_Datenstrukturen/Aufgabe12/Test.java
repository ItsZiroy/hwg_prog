package Algorithmen_und_Datenstrukturen.Aufgabe12;

public class Test {
    public static void main(String[] args) {

        // Test.testQueue();
         Test.testStack();



    }

    public static void testQueue() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enter(1);

        System.out.println(queue.front());

        queue.enter(2);
        queue.enter(3);

        queue.leave();
        queue.leave();
        System.out.println(queue.front());
        queue.leave();
        queue.leave();
    }

    public static void testStack() {
        Stack<Integer> stack = new Stack<Integer>(1,2,3);

        System.out.println(stack.top());

        stack.pop();
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        stack.pop();
    }
}
