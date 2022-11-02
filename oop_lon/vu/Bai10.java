package oop_lon.vu;

import java.util.Scanner;

public class Bai10 {
    static Scanner sc = new Scanner(System.in);
   static int chan = 0;

    public static void main(String[] args) {
        System.out.println("nhập vào số nguyên dương");
        int soNguyenDuong = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= soNguyenDuong; i++) {
            if (i % 2 == 0) {
                chan += i;
            }
        }
        System.out.println("tổng các số chẵn của số nguyên dương là "+chan);
    }
}
