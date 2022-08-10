package ss3;

import java.util.Scanner;

public class timsonhonhattrongmang {
    public static void main(String[] args) {
        int [] array;
        array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu");
        int soLuong = sc.nextInt();
        for (int  i = 0 ;i<soLuong;i++){
            System.out.println("moi nhap phan thu thu " + i);
            array[i] = sc.nextInt();
        }
        for (int  j = 0 ;j<soLuong;j++){
            int min = array[0];
            if(array[j]  < min){
                array[j] = min;
            }
            System.out.println(min);
        }
    }
}
