package projectmodule2.ss5;

import java.util.Scanner;

public class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return getRadius() * 2 * Math.PI;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle testa = new Circle();
        System.out.println("moi ban nhap ban kinh");
        testa.radius = input.nextDouble();
        System.out.println("dien tich la "+testa.getArea());
        System.out.println("mau sac la " + testa.color);




    }

}
