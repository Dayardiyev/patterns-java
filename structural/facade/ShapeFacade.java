package structural.facade;

import structural.facade.shapes.Circle;
import structural.facade.shapes.Rectangle;
import structural.facade.shapes.Shape;
import structural.facade.shapes.Square;

public class ShapeFacade {
    private Shape square;
    private Shape rectangle;
    private Shape circle;

    public ShapeFacade(){
        square = new Square();
        rectangle = new Rectangle();
        circle = new Circle();
    }

    public void makeShapes(){
        drawCircle();
        drawRectangle();
        drawSquare();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawCircle(){
        circle.draw();
    }
}
