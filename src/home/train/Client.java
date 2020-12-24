package home.train;

import home.train.factory.CircleFactory;
import home.train.factory.RectangleFactory;
import home.train.factory.SquareFactory;
import home.train.shapes.Shape;


public class Client {

    public static void main(String[] args) {

        Shape shape1= new RectangleFactory().getShape();
        shape1.draw();

        Shape shape2= new SquareFactory().getShape();
        shape2.draw();

        Shape shape3= new CircleFactory().getShape();
        shape3.draw();

    }

}
