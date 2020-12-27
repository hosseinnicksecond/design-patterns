package home.train;

import home.train.factory.abstractFactory;

public class factoryProduct {
    public static abstractFactory getAbstractFactory(){
        return new abstractFactory();
    }
}
