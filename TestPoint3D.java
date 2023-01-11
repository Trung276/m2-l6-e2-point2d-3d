import java.util.Scanner;

public class TestPoint3D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        float x = sc.nextFloat();
        System.out.println("Enter y: ");
        float y = sc.nextFloat();
        System.out.println("Enter z: ");
        float z = sc.nextFloat();
        Point3D point3D = new Point3D(x, y, z);
        System.out.println(point3D.toString());
    }
}
