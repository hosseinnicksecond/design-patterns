package home.train.model;

public class LargeRobotInterface implements RobotInterface {
    private String robotType;
    private String color;

    public LargeRobotInterface(){
        robotType="LARGE";
        this.color="Blue";
    }

    @Override
    public void print() {

        System.out.println("a Large Robot do Big Things ....");
        System.out.println("Color for "+robotType+" is : "+color);
    }

    @Override
    public void setColor() {

    }
}
