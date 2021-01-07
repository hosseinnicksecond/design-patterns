package home.train.model;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    
    private final Map<String , RobotInterface> RobotMap= new HashMap<>();
    
    public int GetNumberOfRobot(){return this.RobotMap.size();}
    
    public RobotInterface getRobot(String kind){
        RobotInterface myRobot;
        String upper=kind.toUpperCase();
        
        if(RobotMap.containsKey(upper)){
            myRobot =RobotMap.get(upper);
        }else {
            switch (upper){
                case "KING"  :
                    System.out.println("Created New  King Type Robot");
                    myRobot= new Robot("king");
                    RobotMap.put(upper,myRobot);
                    break;
                case "QUEEN" :
                    System.out.println("created New Queen Type of Robot");
                    myRobot=new Robot("Queen");
                    RobotMap.put(upper,myRobot);
                    break;
                case "SMALL" :
                    System.out.println("Created New Small Robot");
                    myRobot =new SmallRobotInterface();
                    RobotMap.put(upper, myRobot);
                    break;
                case "LARGE" :
                    System.out.println("Created New  Large Robot");
                    myRobot = new LargeRobotInterface();
                    RobotMap.put(upper, myRobot);
                    break;
                default:
                    throw new RuntimeException("We don't create "+kind+" Robot !!");
            }
        }

        return myRobot;
    }
}
