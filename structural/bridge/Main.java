package structural.bridge;

import structural.bridge.colors.BlueColor;
import structural.bridge.colors.RedColor;
import structural.bridge.shapes.Rectangle;
import structural.bridge.shapes.Shape;
import structural.bridge.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(new BlueColor());
        square.applyColor();

        Shape rect = new Rectangle(new RedColor());
        rect.applyColor();
    }
}
