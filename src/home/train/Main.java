package home.train;
import home.train.singleton.Eager;

public class Main {

    public static void main(String[] args) {

        Eager singletonM=Eager.getInstance();
        singletonM.setId(3);
        singletonM.setName("main");

       Thread thread1= new Thread(() -> {
           Eager singleton=Eager.getInstance();
           singleton.setId(1);
           singleton.setName("thread 1");
           System.out.println("instance id :"+ singleton.getId()+"  name : "+singleton.getName());
       });

        System.out.println("Main id: "+singletonM.getId()+ " name: "+ singletonM.getName());
       singletonM=null;

       Thread thread2= new Thread(() -> {
           Eager singleton=Eager.getInstance();
           System.out.println("instance id :"+ singleton.getId()+"  name : "+singleton.getName());
       });

       thread1.start();
       thread2.start();


    }

}
