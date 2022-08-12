package ss4;

import java.util.Scanner;

public class bai1 {
    double a, b, c, d, x, x2;

    public bai1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }



    public void

    phuongtrinhbac() {
        d = getB() * getB() - 4 * getA() * getC();

    }

    public void kiemtra() {
        if (d < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else if (d == 0) {
            x = -b / (2 * a);
            System.out.println("phuong trinh co mot nghiem " + x);
        } else {
            x = (int) ((-b + -Math.sqrt(d)) / (2 * a));
            x2 = (int) ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("phuong trinh co hai nghiem phan biet" + "x1 = "+ x +"x2 = "+ x2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a  ");
        double a = scanner.nextInt();
        System.out.println("nhap b  ");
        double b = scanner.nextInt();
        System.out.println("nhap c  ");
        double c = scanner.nextInt();
        bai1 phuongtrinhbac2 = new bai1(a, b, c);
        phuongtrinhbac2.phuongtrinhbac();
        phuongtrinhbac2.kiemtra();


    }
}


