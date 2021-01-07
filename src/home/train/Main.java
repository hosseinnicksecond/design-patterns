package home.train;

import home.train.model.Robot;
import home.train.model.RobotFactory;

public class Main {

    public static void main(String[] args) {

        RobotFactory factory= new RobotFactory();

        for(int i=0;i<3;i++) {
            Robot smallRobot = factory.getRobot("small");
            smallRobot.print();
        }
        System.out.println("size of Object created "+ factory.GetNumberOfRobot());
        for(int i=0;i<4;i++) {
            Robot largeRobot = factory.getRobot("large");
            largeRobot.print();
        }
        System.out.println("size of Object created "+ factory.GetNumberOfRobot());
    }

}
