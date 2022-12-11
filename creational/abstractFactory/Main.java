package creational.abstractFactory;

import creational.abstractFactory.factory.AbstractFactory;
import creational.abstractFactory.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryDemo.getFactory(false);

        Shape square = shapeFactory.getShape("square");
        square.printMe();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.printMe();

        AbstractFactory roundedShapeFactory = FactoryDemo.getFactory(true);

        Shape roundedSquare = roundedShapeFactory.getShape("square");
        roundedSquare.printMe();

        Shape roundedRectangle = roundedShapeFactory.getShape("rectangle");
        roundedRectangle.printMe();
    }
}
