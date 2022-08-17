package projectmodule2.ss6.bai1;

import projectmodule2.ss6.bai1.cylinder;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cylinder cylinder1 = new cylinder();
        System.out.println("nhap chieu cao ");
        cylinder1.setHeight(scanner.nextDouble());
        System.out.println("nhap ban kinh ");
        cylinder1.setRadius(scanner.nextDouble());
        System.out.println("nhap mau sac");
        cylinder1.setColor(scanner.nextLine());
        cylinder1.areacylinder();
        System.out.println(cylinder1.toString());
    }
}
