import java.awt.Point;

public class Point {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(point1);
        point1.x = 3;

        System.out.println("Point2: " + point2);
        System.out.println("Point1: " + point1);
    }
}