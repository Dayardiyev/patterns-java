package structural.bridge.shapes;

import structural.bridge.colors.Color;

public class Rectangle extends Shape{

    public Rectangle(Color c){
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Rectangle filled with color ");
        c.applyColor();
        System.out.print(".\n");
    }
}
