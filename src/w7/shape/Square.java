package w7.shape;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.length;
    }

    public void setSide(double side) {
        super.length = side;
        super.width = side;
    }

    @Override
    public void setWidth(double side) {
        super.length = side;
        super.width = side;
    }

    @Override
    public void setLength(double side) {
        super.length = side;
        super.width = side;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Width: " + width + ". Length: "+ length + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimeter: " + getPerimeter() + "\n";
    }
}
