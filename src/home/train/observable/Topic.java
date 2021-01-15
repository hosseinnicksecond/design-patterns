package home.train.observable;

import home.train.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject{

    private List<Observer> observerList;
    private String message;
    private boolean isChanged;

    public Topic(){
        this.observerList= new ArrayList<>();
        isChanged=false;
    }

    @Override
    public void attachObserver(Observer obj) {
        if(obj==null) throw new RuntimeException("Follower can not be null");
        if (!(this.observerList.contains(obj))) {
            this.observerList.add(obj);
        }
    }

    @Override
    public void detachObserver(Observer obj) {
        this.observerList.remove(obj);
    }

    @Override
    public void notifyObserver() {
        List<Observer> noty;
        if(!isChanged)return;

        noty=new ArrayList<>(this.observerList);
        this.isChanged=false;
        for (Observer o:noty){
            o.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void post(String message){
        System.out.println("Message posted to followers "+message);
        this.message=message;
        isChanged=true;
        notifyObserver();
    }
}
