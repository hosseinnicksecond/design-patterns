package home.train.factory;

import home.train.color.Blue;
import home.train.color.Color;
import home.train.color.Green;
import home.train.color.Red;

public class ColorFactory {

    public static Color getColor(String colorName){

        switch (colorName.toUpperCase()){

            case "RED" : return new Red();
            case "GREEN": return new Green();
            case "BLUE" : return new Blue();
            default:return null;
        }
    }
}
