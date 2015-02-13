/**
 * Author: Connor P Grady
 * Born: 2/11/2015
 */
public class Circle extends Shape {
    public Circle(Point center, double radius) {

    }

    private Point center;
    private double radius;

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        // C[(x,y), radius]
        return "C[" + center.toString() + ", " + radius + "]";
    }

    @Override
    public boolean hit(Point p) {
        return false;
    }

    @Override
    public double perimeter() throws UnsupportedOperationException {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public double area() throws UnsupportedOperationException {
        double area = Math.PI * radius * radius;
        return area;
    }
}
