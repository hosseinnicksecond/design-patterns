package home.train.factory;

import home.train.color.Color;
import home.train.shape.Shape;

public class abstractFactory {

    public Shape getShape(String shapeName){
        return ShapeFactory.getShape(shapeName);
    }

    public Color getColor(String colorName){
        return ColorFactory.getColor(colorName);
    }
}
