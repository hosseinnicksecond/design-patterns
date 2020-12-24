package home.train.factory;

import home.train.shapes.Shape;

public abstract class abstractFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
}
