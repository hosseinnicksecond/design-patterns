package home.train.singleton;

public class Lazy {

    private int id;
    private String name;
    private static Lazy instance=null;

    private Lazy(){}

    public static Lazy getInstance(){
        if(instance==null){
            System.out.println("create new instance");
            instance=new Lazy();

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
