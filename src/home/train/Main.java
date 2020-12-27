package home.train;

import home.train.color.Color;
import home.train.factory.abstractFactory;
import home.train.shape.Shape;

public class Main {

    public static void main(String[] args) {


        Shape shape1=abstractFactory.getShape("circle");
        Color color1=abstractFactory.getColor("red");

//        assert shape1 != null;
//        assert color1 != null;
        System.out.println(shape1.draw()+" :: "+color1.fill());
    }

}
