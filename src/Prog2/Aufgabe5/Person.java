package Prog2.Aufgabe5;

public class Person {

    private final String name;
    private final int alter;

    public Person(String name, int alter) throws NullPointerException, IllegalArgumentException {
        if(name == null) {
            throw new NullPointerException();
        }
        if(alter < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public boolean isAdult() {
        return this.alter > 17;
    }
}
