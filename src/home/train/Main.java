package home.train;

import home.train.observable.Topic;
import home.train.observers.Follower;

public class Main {

    public static void main(String[] args) {

        Topic topic= new Topic();

        Follower follower1= new Follower("One");
        Follower follower2= new Follower("Two");
        Follower follower3= new Follower("Three");

        topic.attachObserver(follower1);
        topic.attachObserver(follower2);
        topic.attachObserver(follower3);

        follower1.setSubject(topic);
        follower2.setSubject(topic);
        follower3.setSubject(topic);

        topic.post("first message");
        topic.notifyObserver();

        follower1.getMessages();
        follower2.getMessages();
        follower3.getMessages();

        follower2.detach();

        topic.post("Second Message");
        topic.notifyObserver();

        follower1.getMessages();
        follower2.getMessages();
        follower3.getMessages();

    }

}
