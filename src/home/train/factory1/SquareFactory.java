package home.train.factory1;

import home.train.shapes.Shape;
import home.train.shapes.Square;

public class SquareFactory extends abstractFactory{

    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
