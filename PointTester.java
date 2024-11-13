import java.awt.Point;

public class PointTester {
    public static void main(String[] args) {
        Point q = new Point(2, 5);
        System.out.println(q.toString());

        q.setLocation(q.getY(), q.getX());
        System.out.println("q: " + q.toString());

        Point p = new Point(q);
        System.out.println("p: " + p.toString());

        System.out.println("both points are equal: " + p.equals(q));
        System.out.println("x coordinates: " + p.getX() + " " + q.getX());


    }
}