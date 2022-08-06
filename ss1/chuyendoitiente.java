import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        int usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so tien");
        usd = scanner.nextInt();
        int vnd = 23000 * usd;
        System.out.println(vnd);
    }
}
