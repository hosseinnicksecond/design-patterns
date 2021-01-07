package home.train.model;

import java.util.Objects;

public class Robot implements RobotInterface{
    private String robotType;
    private String color;

    public Robot(String type){
        this.robotType=type;
    }

    public void setColor(){
        this.color=RobotColor.getColor();
        System.out.println("Color for "+robotType+" is : "+color);
    }

    @Override
    public void print() {
        System.out.println(robotType+ " Do Stuff of "+robotType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return robotType.equals(robot.robotType) && color.equals(robot.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(robotType, color);
    }
}
