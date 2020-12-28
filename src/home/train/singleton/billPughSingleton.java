package home.train.singleton;

public class billPughSingleton {
    private int id ;
    private String name;

    private billPughSingleton(){}

    private static class helper{
        private static final billPughSingleton instance= new billPughSingleton();
    }

    public static billPughSingleton getInstance(){
        return helper.instance;
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
