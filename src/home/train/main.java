package home.train;

import home.train.color.Color;
import home.train.factory.abstractFactory;
import home.train.shape.Shape;

public class main {

    public static void main(String[] args) {

        abstractFactory factory= factoryProduct.getAbstractFactory();

        Shape shape1=factory.getShape("circle");
        Color color1=factory.getColor("red");

        System.out.println(shape1.draw()+" :: "+color1.fill());
    }

}
