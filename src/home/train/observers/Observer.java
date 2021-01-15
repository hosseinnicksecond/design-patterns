package home.train.observers;

import home.train.observable.Subject;

public interface Observer {

    void update();
    void setSubject(Subject subject);
    String getName();
}
