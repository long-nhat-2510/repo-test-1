package Main;

public abstract class User extends Entity {
    protected String name;
    public User(String id, String name) {
        super(id);
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
