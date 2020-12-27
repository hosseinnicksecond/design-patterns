package home.train.factory;

import home.train.shape.Circle;
import home.train.shape.Rectangle;
import home.train.shape.Shape;
import home.train.shape.Square;

public class ShapeFactory {

    public static Shape getShape(String shapeName){

        switch (shapeName.toUpperCase()){

            case "CIRCLE" : return new Circle();
            case "RECTANGLE" : return new Rectangle();
            case "SQUARE" : return new Square();
            default: return null;
        }
    }
}
