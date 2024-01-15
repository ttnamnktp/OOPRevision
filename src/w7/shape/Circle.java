package w7.shape;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Radius: " + radius + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimeter: " + getPerimeter() + "\n";
    }
}
