package ss3;

import java.util.Scanner;

public class xoaphantutrongmang {
    public static void main(String[] args) {
        int n;
        int x;
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so luong phan tu");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("nhap phan tu thu " + i);
            array[i] = input.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(array[i]);
        }
        System.out.println("nhap phan tu can xoa");
        x = input.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (array[j]==x){
                for (int i = j; i < array.length;i++){
                    if (i == (array.length - 1)){
                        array[i]=0;
                    }else {
                        array[i] = array[i+1] ;
                    }
                }
                break;
            }

        }
        System.out.println("mang sau khi xoa");
        for (int i = 1; i <= n; i++) {
            System.out.print(array[i]);
        }


    }
}
