package w7.shape.Main;

import w7.shape.Circle;
import w7.shape.Rectangle;
import w7.shape.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2);
        circle.setColor("Blue");
        circle.setFilled(true);
        Rectangle rectangle = new Rectangle(3,2);
        rectangle.setColor("Red");
        Square square = new Square("Yellow", true, 5);
        square.setSide(6);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }
}
