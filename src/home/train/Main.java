package home.train;

import home.train.singleton.doubleCheckLocking;

public class Main {

    public static void main(String[] args) {

        doubleCheckLocking singletonM=doubleCheckLocking.getInstance();
        singletonM.setId(3);
        singletonM.setName("main");

       Thread thread1= new Thread(() -> {
           doubleCheckLocking singleton=doubleCheckLocking.getInstance();
           singleton.setId(1);
           singleton.setName("thread 1");
           System.out.println("instance id :"+ singleton.getId()+"  name : "+singleton.getName());
       });

        System.out.println("Main id: "+singletonM.getId()+ " name: "+ singletonM.getName());
       singletonM=null;

       Thread thread2= new Thread(() -> {
           doubleCheckLocking singleton=doubleCheckLocking.getInstance();
           System.out.println("instance id :"+ singleton.getId()+"  name : "+singleton.getName());
       });

       thread1.start();
       thread2.start();


    }

}
