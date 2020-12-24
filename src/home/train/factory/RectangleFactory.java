package home.train.factory;

import home.train.shapes.Rectangle;
import home.train.shapes.Shape;

public class RectangleFactory extends abstractFactory{

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
