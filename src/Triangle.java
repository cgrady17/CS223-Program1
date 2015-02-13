/**
 * Author: Connor P Grady
 * Born: 2/11/2015
 */
public class Triangle extends Shape implements Polygon {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public String toString() {
        // T[(x1,y1), (x2,y2), (x3,y3)]
        return "T[" + p1.toString() + ", " + p2.toString() + ", " + p3.toString() + "]";
    }

    @Override
    public double perimeter() throws UnsupportedOperationException {
        // base + height + hypotenuse
        double base = p2.getX() - p1.getX();
        double height = p3.getX() - p2.getX();
        double hypotenuse = p3.getX() - p1.getX();
        return base + height + hypotenuse;
    }

    @Override
    public int numOfSides() {
        return 3;
    }

    @Override
    public boolean hit(Point p) {
        return false;
    }
}
