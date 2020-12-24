package home.train.factory;

import home.train.shapes.Circle;
import home.train.shapes.Shape;

public class CircleFactory extends abstractFactory{

    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
