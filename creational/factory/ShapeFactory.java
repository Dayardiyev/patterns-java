package creational.factory;

import creational.factory.shapes.Circle;
import creational.factory.shapes.Shape;
import creational.factory.shapes.Square;
import creational.factory.shapes.Triangle;

public class ShapeFactory {
    public Shape getShape(String s){
      if (s.equalsIgnoreCase("Circle")){
          return new Circle();
      } else if (s.equalsIgnoreCase("Square")){
          return new Square();
      } else if (s.equalsIgnoreCase("Triangle")) {
          return new Triangle();
      }
      return null;
    }
}
