

import java.util.Scanner;

public class chuyensothanhchu {
    public static void main(String[] args) {
        int so;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so bat ki");
        so = scanner.nextInt();
        int tram = so / 100;
        int chuc = (so / 10) % 10;
        int dv = so % 10;
        switch (tram) {
            case 1:
                System.out.print("Mot Tram ");
                break;
            case 2:
                System.out.print("HaiTram ");
                break;
            case 3:
                System.out.print("Ba Tram ");
                break;
            case 4:
                System.out.print("Bon Tram ");
                break;
            case 5:
                System.out.print("Nam Tram ");
                break;
            case 6:
                System.out.print("Sau Tram ");
                break;
            case 7:
                System.out.print("Bay Tram ");
                break;
            case 8:
                System.out.print("Tam Tram ");
                break;
            case 9:
                System.out.print("Chin Tram ");
                break;
            default:
                System.out.print("");

        }
        switch (chuc) {
            case 0: {
                if (tram != 0) {
                    System.out.print("Le ");
                }
                break;
            }
            case 1:
                System.out.print("Muoi ");
                break;
            case 2:
                System.out.print("Hai muoi ");
                break;
            case 3:
                System.out.print("Ba muoi  ");
                break;
            case 4:
                System.out.print("Bon muoi ");
                break;
            case 5:
                System.out.print("Nam muoi ");
                break;
            case 6:
                System.out.print("Sau muoi ");
                break;
            case 7:
                System.out.print("Bay muoi ");
                break;
            case 8:
                System.out.print("Tam muoi ");
                break;
            case 9:
                System.out.print("Chin muoi ");
                break;
            default:
                System.out.print("");
                break;
        }
        switch (dv) {
            case 1:
                System.out.print("Mot ") ;
                break;
            case 2:
                System.out.print("Hai ");
                break;
            case 3:
                System.out.print("Ba ");
                break;
            case 4:
                System.out.print("Bon ");
                break;
            case 5: {
                if (chuc == 0) {
                    System.out.print("nam ");
                } else {
                    System.out.print("lam ");
                }
                break;
            }
            case 6 : System.out.print("Sau " );
                break;
            case 7 : System.out.print("Bay ");
                break;
            case 8 : System.out.print("Tam ");
                break;
            case 9 : System.out.print("Chin ");
                break;
        }

    }
}
