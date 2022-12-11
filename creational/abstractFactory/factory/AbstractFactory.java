package creational.abstractFactory.factory;

import creational.abstractFactory.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}
