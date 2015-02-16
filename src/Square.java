/**
 * Author: Connor P Grady
 * Born: 2/11/2015
 */
public class Square extends Rectangle implements Polygon {
    private Point upperLeft;
    private Point lowerRight;
    private Point upperRight;
    private Point lowerLeft;

    public Square(Point upperLeft, Point lowerRight) {
        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;

        // Check if valid square
        double xc = (upperLeft.getX() + lowerRight.getX())/2;
        double yc = (upperLeft.getY() + lowerRight.getY())/2;
        double xd = (upperLeft.getX() - lowerRight.getX())/2;
        double yd = (upperLeft.getY() - lowerRight.getY())/2;

        double x3 = xc - yd;
        double y3 = yc + xd;
        double x4 = xc + yd;
        double y4 = yc - xd;

        upperRight.setX(x3);
        upperRight.setY(y3);

        lowerLeft.setX(x4);
        lowerLeft.setY(y4);
    }

    public String toString() {
        //same as Rectangle's toString
        return "R[" + upperLeft.toString() + ", " + lowerRight.toString() + "]";
    }

    @Override
    public int numOfSides() {
        return 4;
    }

    @Override
    public double perimeter() throws UnsupportedOperationException {
        return super.perimeter();
    }
}
