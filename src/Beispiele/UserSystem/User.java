package Beispiele.UserSystem;

public class User {

    public String uid;
    private String name;

    public User(String uid, String name) {
        this.name = name;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }
}
