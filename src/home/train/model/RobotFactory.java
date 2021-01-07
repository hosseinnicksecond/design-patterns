package home.train.model;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    
    private Map<String ,Robot> RobotMap= new HashMap<>();
    
    public int GetNumberOfRobot(){return this.RobotMap.size();}
    
    public Robot getRobot(String kind){
        Robot robot;
        
        if(RobotMap.containsKey(kind)){
            robot=RobotMap.get(kind);
        }else {
            switch (kind.toUpperCase()){
                case "SMALL" :
                    System.out.println("Created New Small Robot");
                    robot=new SmallRobot();
                    RobotMap.put(kind,robot);
                    break;
                case "LARGE" :
                    System.out.println("Created New  Large Robot");
                    robot= new LargeRobot();
                    RobotMap.put(kind,robot);
                    break;
                default:
                    throw new RuntimeException("We don't create "+kind+" Robot !!");
            }
        }

        return robot;
    }
}
