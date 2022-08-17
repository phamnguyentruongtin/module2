package projectmodule2.ss6.bai1.bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point3d point3d = new Point3d();
        System.out.println("input x");
        point3d.setX(scanner.nextFloat());
        System.out.println("input y ");
        point3d.setY(scanner.nextFloat());
        System.out.println("input z");
        point3d.setZ(scanner.nextFloat());
        point3d.getXYZ();
        System.out.println(point3d.toString());

    }
}
