package projectmodule2.ss14;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input a");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Input b");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Input c");
            int c = Integer.parseInt(sc.nextLine());
            if (a<0||b<0||c<0||a+b<c||b+c<a||a+c<b)
            throw new IllegalTriangleException();
        }
        catch(IllegalTriangleException e){
            System.out.println("Input invalid!!!!!");

            }

        }
    }