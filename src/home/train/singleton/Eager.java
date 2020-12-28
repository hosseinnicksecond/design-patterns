package home.train.singleton;

public class Eager {

    private int id;
    private String name;
    private static Eager instance=new Eager();

    private Eager(){}

    public static Eager getInstance(){
        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
