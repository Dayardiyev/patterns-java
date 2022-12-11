package structural.bridge.shapes;

import structural.bridge.colors.Color;

public abstract class Shape {
    protected Color c;

    public Shape(Color c){
        this.c = c;
    }

    public abstract void applyColor();
}
