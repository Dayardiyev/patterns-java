package creational.factory;

import creational.factory.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.printMe();
    }
}
