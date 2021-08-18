package InheritanceTest;

public class Child extends Parent {

    public Child() {
        super(); // Kann keine Parameter an Grandparent übergeben
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.pflege();
        c.n = 3;

    }
}
