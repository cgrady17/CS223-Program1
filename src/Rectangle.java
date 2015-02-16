import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Author: Connor P Grady
 * Born: 2/11/2015
 */
public class Rectangle extends Shape {
    private Point upperLeft;
    private Point lowerRight;
    private Point upperRight;
    private Point lowerLeft;

    private double width;
    private double height;

    public Rectangle(Point upperLeft, Point lowerRight) throws InvalidArgumentException {
        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;

        // Check if makes valid rectangle (How???)
    }

    public void setUpperLeft(Point p) {
        this.upperLeft = p;
    }

    public void setLowerRight(Point p) {
        this.lowerRight = p;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public Point getLowerRight() {
        return lowerRight;
    }

    public Point getUpperRight() {

    }

    public Point getLowerLeft() {

    }

    public String toString() {
        // R[(x1,y1),(x2,y2)]
        return "R[" + upperLeft.toString() + ", " + lowerRight.toString() + "]";
    }

    @Override
    public boolean hit(Point p) {
        return false;
    }

    @Override
    public double area() throws UnsupportedOperationException {

    }

    @Override
    public double perimeter() throws UnsupportedOperationException {

    }
}
