package creational.abstractFactory;

import creational.abstractFactory.factory.AbstractFactory;
import creational.abstractFactory.factory.RoundedShapeFactory;
import creational.abstractFactory.factory.ShapeFactory;

public class FactoryDemo {
    public static AbstractFactory getFactory(boolean rounded){
        if (rounded){
            return new RoundedShapeFactory();
        } else{
            return new ShapeFactory();
        }
    }
}
