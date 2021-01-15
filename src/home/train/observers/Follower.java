package home.train.observers;

import home.train.observable.Subject;

import java.util.ArrayList;
import java.util.List;

public class Follower implements Observer{

    private final String name;
    private final List<String> messages;
    //not required, could just pass subject state to update() , but , need for detach
    private Subject subject;

    public Follower(String name){
        this.messages= new ArrayList<>();
        this.name= name;
    }

    @Override
    public void update() {
      //this method could have an argument and don't ask for update
      //and change from Subject
        String message=(String)subject.getUpdate(this);
        if(message==null){
            System.out.println(name+" ::  No new message ");
        }else {
            System.out.println(name+" ::  Consuming message \""+message+"\"");
            this.messages.add(message);
        }
    }

    @Override
    public void setSubject(Subject subject) {
         this.subject=subject;
    }

    public void getMessages(){
        System.out.println("****** "+name+" *******");
        this.messages.forEach(System.out::println);
    }

    public void detach(){
        System.out.println("Detach : "+name+" !!!");
        this.subject.detachObserver(this);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
