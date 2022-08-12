package ss4;

import java.util.Scanner;

public class bai2 {
    long batdau, ketthuc;

    public void setBatdau(long batdau) {
        this.batdau = batdau;
    }

    public void setKetthuc(long ketthuc) {
        this.ketthuc = ketthuc;
    }

    public long getBatdau() {
        return batdau;
    }

    public long getKetthuc() {
        return ketthuc;
    }

    public long timelapse() {
        return ketthuc - batdau;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thoi gian bat dau");
        long start = scanner.nextLong();
        long end = scanner.nextLong();
        bai2 stopwatch = new bai2();
        stopwatch.setBatdau(start);
        stopwatch.setKetthuc(end);
        System.out.println("thoi gian timlapse la " + stopwatch.timelapse());


    }
}
