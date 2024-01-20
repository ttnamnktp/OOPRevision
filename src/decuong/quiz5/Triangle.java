package decuong.quiz5;

import decuong.quiz5.sub.Test;

public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
        this.p3 = new Point(x3, y3);
    }

    public double getPerimeter(){
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(new Point(0,0), new Point(1,0), new Point(0,1));
        System.out.println(triangle1.getPerimeter());
    }
}
