package home.train;

import home.train.factory2.ShapeFactory;
import home.train.shapes.Shape;


public class Client {

    public static void main(String[] args) {

        Shape shape1= ShapeFactory.getShape("rectangle");
        shape1.draw();

        Shape shape2= ShapeFactory.getShape ("square");
        shape2.draw();

        Shape shape3= ShapeFactory.getShape("circle");
        shape3.draw();

    }

}
