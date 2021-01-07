package home.train;

import home.train.model.RobotInterface;
import home.train.model.RobotFactory;

public class Main {

    public static void main(String[] args) {

        RobotFactory factory= new RobotFactory();

        System.out.println("//////////////////////////");
        for(int i=0;i<3;i++) {
            RobotInterface smallRobot = factory.getRobot("small");
            smallRobot.print();
        }
        System.out.println("//////////////////////////");
        System.out.println("size of Object created "+ factory.GetNumberOfRobot());
        for(int i=0;i<4;i++) {
            RobotInterface largeRobot = factory.getRobot("large");
            largeRobot.print();

        }
        System.out.println("//////////////////////////");
        System.out.println("size of Object created "+ factory.GetNumberOfRobot());
        for(int i=0;i<2;i++){
            RobotInterface kingRobot=factory.getRobot("king");
            kingRobot.print();
            kingRobot.setColor();
        }
        System.out.println("//////////////////////////");
        System.out.println("size of Object created "+ factory.GetNumberOfRobot());
        for(int i=0;i<3;i++){
            RobotInterface queenRobot=factory.getRobot("queen");
            queenRobot.print();
            queenRobot.setColor();
        }
        System.out.println("size of Object created "+ factory.GetNumberOfRobot());
    }

}
