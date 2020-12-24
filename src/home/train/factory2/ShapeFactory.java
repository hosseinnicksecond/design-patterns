package home.train.factory2;

import home.train.shapes.Circle;
import home.train.shapes.Rectangle;
import home.train.shapes.Shape;
import home.train.shapes.Square;

public class ShapeFactory {

    public static Shape getShape(String shapeName){

        switch (shapeName.toUpperCase()){
            case "CIRCLE" : return new Circle();
            case "SQUARE" : return new Square();
            case "RECTANGLE" : return new Rectangle();
            default: throw new RuntimeException( shapeName+" Not in the list");
        }

    }
}
