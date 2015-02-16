import com.sun.javaws.exceptions.InvalidArgumentException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Connor P Grady
 * Born: 2/11/2015
 */
public class Driver {

    try {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        int choice;
        // Create Scanner object
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Shape Land");
        System.out.println("What would you like to do?");
        System.out.println("1) Add a shape");
        System.out.println("2) Update a shape");
        System.out.println("3) Remove a shape");
        System.out.println("4) List all shapes");
        System.out.println("5) List all polygon shapes");
        System.out.println("6) List all non-polygon shapes");
        System.out.println("7) Display total perimeter");
        System.out.println("8) Display total area");
        System.out.println("9) Throw dart");
        System.out.println("10) Exit program");
        System.out.print("Pick a choice: ");
        choice = s.nextInt(); // get input

        if (choice == 1) {
            System.out.println("Pick a shape to add");
            System.out.println("1) Point");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Triangle");
            System.out.println("5) Cancel");
            System.out.print("Your choice: ");
            choice = s.nextInt();
            if (choice == 1) {
                System.out.println("Adding a Point");
                System.out.print("Enter the Point's X coordinate: ");
                double thisX = s.nextDouble();
                System.out.println();
                System.out.print("Enter the Point's Y coordinate: ");
                double thisY = s.nextDouble();

                // Create Point
                Point p = new Point(thisX, thisY);
                // Add point to Shape List
                shapeList.add(p);

                System.out.println("Point (" + thisX + ", " + thisY + ") added.");
            } else if (choice == 2) {
                System.out.println("Adding a Rectangle");
                System.out.print("Enter the Upper Left Point's X coordinate: ");
                double ulX = s.nextDouble();
                System.out.println();
                System.out.print("Enter the Upper Left Point's Y coordinate: ");
                double ulY = s.nextDouble();
                System.out.print("Enter the Lower Right Point's X coordinate: ");
                double lrX = s.nextDouble();
                System.out.println();
                System.out.print("Enter the Lower Right Point's Y coordinate: ");
                double lrY = s.nextDouble();
                Point upperLeft = new Point(ulX, ulY);
                Point lowerRight = new Point (lrX, lrY);
                // Create Shape
                Rectangle r = new Rectangle(upperLeft, lowerRight);
                // Add shape to Shape List
                shapeList.add(r);
            } else if (choice == 3) {
                System.out.println("Adding a Square");
                System.out.print("Enter the Upper Left Point's X coordinate: ");
                double ulX = s.nextDouble();
                System.out.println();
                System.out.print("Enter the Upper Left Point's Y coordinate: ");
                double ulY = s.nextDouble();
                System.out.print("Enter the Lower Right Point's X coordinate: ");
                double lrX = s.nextDouble();
                System.out.println();
                System.out.print("Enter the Lower Right Point's Y coordinate: ");
                double lrY = s.nextDouble();
                Point upperLeft = new Point(ulX, ulY);
                Point lowerRight = new Point (lrX, lrY);
                // Create Shape
                Square sq = new Square(upperLeft, lowerRight);
                // Add shape to Shape List
                shapeList.add(sq);
            } else if (choice == 4) {
                System.out.println("Adding a Triangle");
                System.out.print("Enter the Point 1's X coordinate: ");
                double x1 = s.nextDouble();
                System.out.println();
                System.out.print("Enter the Point 1's Y coordinate: ");
                double y1 = s.nextDouble();
                System.out.print("Enter the Point 2's X coordinate: ");
                double x2 = s.nextDouble();
                System.out.println();
                System.out.print("Enter the Point 2's Y coordinate: ");
                double y2 = s.nextDouble();
                System.out.print("Enter the Point 3's X coordinate: ");
                double x3 = s.nextDouble();
                System.out.println();
                System.out.print("Enter the Point 3's Y coordinate: ");
                double y3 = s.nextDouble();

                // Create Point
                Point p1 = new Point(x1, y1);
                Point p2 = new Point(x2, y2);
                Point p3 = new Point(x3, y3);
                // Create Shape
                Triangle t = new Triangle(p1, p2, p3);
                // Add shape to Shape List
                shapeList.add(t);
            } else if (choice == 5) {
                System.exit(0); // Quit softly
            } else {
                System.out.println("Invalid Input");
                System.out.println("Exiting....");
                System.exit(1); // Quit hardly
            }
        } else if (choice == 2) {
            System.out.println("Which shape would you like to update?");
            for (int i = 0; i < shapeList.size(); i++) {
                System.out.println((i + 1) + ") " + this.toString());
            }
            choice = s.nextInt();


        } else if (choice == 3) {
            System.out.println("Which shape would you like to remove?");
            for (int i = 0; i < shapeList.size(); i++) {
                System.out.println((i + 1) + ") " + this.toString());
            }
            choice = s.nextInt();
        } else if (choice == 4) {
            // List all Shapes
            for (int i = 0; i < shapeList.size(); i++) {
                System.out.println((i + 1) + ") " + this.toString());
            }

        } else if (choice == 5) {
            // List all Polygon shapes
            int count = 1;
            for (int i = 0; i < shapeList.size(); i++) {
                if (this instanceof Polygon) {
                    System.out.println(count + ") " + this.toString());
                    count++;
                }
            }

        } else if (choice == 6) {
            // List all non-polygon shapes
            int count = 1;
            for (int i = 0; i < shapeList.size(); i++) {
                if (!(this instanceof Polygon)) {
                    System.out.println(count + ") " + this.toString());
                    count++;
                }
            }

        } else if (choice == 7) {
            // Display total perimeter
            double perimeter = 0;
            for (int i = 0; i < shapeList.size(); i++) {
                perimeter += this.perimeter();
            }

        } else if (choice == 8) {
            // Display total area
            double area = 0;
            for (int i = 0; i < shapeList.size(); i++) {
                area += this.area();
            }

        } else if (choice == 9) {
            // Throw dart

        } else if (choice == 10) {
            System.out.println("Exiting...");
            System.exit(0);
        }
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    } catch (UnsupportedOperationException uoe) {
        System.out.println(uoe.getMessage());
    } catch (InvalidArgumentException iae) {
        System.out.println(iae.getMessage());
    }

}
