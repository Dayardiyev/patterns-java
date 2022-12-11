package creational.abstractFactory.factory;

import creational.abstractFactory.shapes.Rectangle;
import creational.abstractFactory.shapes.Shape;
import creational.abstractFactory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
