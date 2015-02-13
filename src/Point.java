/**
 * Author: Connor P Grady
 * Born: 2/11/2015
 */
public class Point extends Shape {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        // (x, y)
        return "(" + x + ", " + y + ")";
    }

    public static double distance(Point p1, Point p2) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }

    @Override
    public boolean hit(Point p) {
        return false;
    }

    @Override
    public double area() throws UnsupportedOperationException {
        double area = 0; // Area of a point is 0
        return area;
    }

    @Override
    public double perimeter() throws UnsupportedOperationException {
        double perimeter = 0; // Perimeter of a point is 0
        return perimeter;
    }
}
