package InheritanceTest;

public class Grandparent {
    public Grandparent(/* Parameter können nicht von Child hoch gegeben werden (z.B. int n, int g)*/) {
        System.out.println("Grandparent");
    }
    protected int n = 3;

    protected void pflege() {

    }
}
