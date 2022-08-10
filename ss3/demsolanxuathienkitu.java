package ss3;

import java.util.Scanner;

public class demsolanxuathienkitu {
    public static void main(String[] args) {
        String [] chuoi = {"a","b","c","d","e","f","y","a","c"};

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ki tu  muon tim");
        char find = sc.next().charAt(0);
        int dem = 0;
        for (int i =0;i<chuoi.length;i++){
            if(chuoi[i].charAt(0)==find){
                dem++;
            }
        }
        System.out.println(dem);

    }
}
