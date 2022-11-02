package oop_lon.baitap2.so_giao_thong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface IServ {
    Scanner sc = new Scanner(System.in);
    List <Vehicle > vehicleList = new ArrayList<>();
    void them();
    void xuatKeTienThue();
    void indanhsachtheoloai(String loaixe);
    void indanhsachgiatrilon();
}