import java.util.Scanner;

public class TestPoint2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        float x = sc.nextFloat();
        System.out.println("Enter y: ");
        float y = sc.nextFloat();
        Point2D point2D = new Point2D(x, y);
        System.out.println(point2D.toString());
    }
}
