package home.train.singleton;

public class synchronizedSingleton {

    private int id;
    private String name;
    private static synchronizedSingleton instance=null;

    private synchronizedSingleton(){}

    public static synchronized synchronizedSingleton getInstance(){
        if(instance==null){
            instance= new synchronizedSingleton();
        }
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
