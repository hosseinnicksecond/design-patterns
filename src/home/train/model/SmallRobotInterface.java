package home.train.model;

public class SmallRobotInterface implements RobotInterface {

    private final String robotType;
    private String color;

    public SmallRobotInterface(){
        this.robotType="SMALL";
        this.color = "Red";
    }

    @Override
    public void print() {

        System.out.println("Small Robot Do Small Thing .... ");
        System.out.println("Color for "+robotType+" is : "+color);
    }

    @Override
    public void setColor() {

    }
}
