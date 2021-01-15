package home.train.observable;

import home.train.observers.Observer;

public interface Subject {

    void attachObserver(Observer obj);
    void detachObserver(Observer obj);
    void notifyObserver();
    //method to get updates from subject , not required , but , added to observer
    Object getUpdate(Observer obj);
}
