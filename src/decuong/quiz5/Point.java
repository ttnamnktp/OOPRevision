package decuong.quiz5;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        double v = (x - this.x)*(x - this.x)  + (y - this.y) * (y - this.y);
        return Math.sqrt(v);
    }

    public double distance(Point p) {
        double v = (x - p.getX())*(x - p.getX())  + (y - p.getY()) * (y - p.getY());
        return Math.sqrt(v);
    }

    public double distance() {
        double v = x * x + y * y;
        return Math.sqrt(v);
    }
}
