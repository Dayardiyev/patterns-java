package creational.abstractFactory.factory;

import creational.abstractFactory.shapes.RoundedRectangle;
import creational.abstractFactory.shapes.RoundedSquare;
import creational.abstractFactory.shapes.Shape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("square")) {
            return new RoundedSquare();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new RoundedRectangle();
        }
        return null;
    }
}
