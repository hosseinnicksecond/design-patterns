package home.train.singleton;

public class doubleCheckLocking {

    private int id;
    private String name;
    private volatile static doubleCheckLocking instance=null;

    private doubleCheckLocking(){}

    public static doubleCheckLocking getInstance(){
        if (instance==null){
            synchronized (doubleCheckLocking.class){
                if(instance==null){
                    instance=new doubleCheckLocking();
                }
            }
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
