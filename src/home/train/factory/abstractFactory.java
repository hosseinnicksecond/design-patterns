package home.train.factory;

import home.train.color.Blue;
import home.train.color.Color;
import home.train.color.Green;
import home.train.color.Red;
import home.train.shape.Circle;
import home.train.shape.Rectangle;
import home.train.shape.Shape;
import home.train.shape.Square;

public class abstractFactory {

    public static Shape getShape(String shapeName){
        switch (shapeName.toUpperCase()){

            case "CIRCLE" : return new Circle();
            case "RECTANGLE" : return new Rectangle();
            case "SQUARE" : return new Square();
            default: throw new RuntimeException("can't find shape of "+ shapeName);
        }
    }

    public static Color getColor(String colorName){
        switch (colorName.toUpperCase()){

            case "RED" : return new Red();
            case "GREEN": return new Green();
            case "BLUE" : return new Blue();
            default: throw new RuntimeException("can't find color of "+ colorName);
        }
    }
}
