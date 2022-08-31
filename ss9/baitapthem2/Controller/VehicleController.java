package projectmodule2.ss9.baitapthem2.Controller;

import projectmodule2.ss9.baitapthem2.Model.Oto;
import projectmodule2.ss9.baitapthem2.Model.XeMay;
import projectmodule2.ss9.baitapthem2.Model.XeTai;
import projectmodule2.ss9.baitapthem2.Services.ServiceImpl;


import java.util.Scanner;


public class VehicleController {
    private static ServiceImpl service = new ServiceImpl();

    static Scanner sc = new Scanner(System.in);
    static int selectChoice = 0;
    static int selectVehicle1 = 0;
    static int selectVehicle2 = 0;
    static int selectVehicle3 = 0;
    static int selectVehicle4 = 0;

    public static void add() {
        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = sc.nextLine();
        System.out.println("Nhập tên nhà sản xuất");
        String tenNhaSanXuat = sc.nextLine();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String chuSoHuu = sc.nextLine();
        if (selectVehicle1 == 1) {
            System.out.println("Nhập tải trọng");
            String taiTrong = sc.nextLine();
            XeTai xeTai = new XeTai(bienKiemSoat, tenNhaSanXuat, namSanXuat, chuSoHuu, taiTrong);
            service.addVehicleXeTai(xeTai);
        } else if (selectVehicle1 == 2) {
            System.out.println("Nhập số chỗ ngồi");
            String soChoNgoi = sc.nextLine();
            System.out.println("Nhập kiểu xe");
            String kieuXe = sc.nextLine();
            Oto oto = new Oto(bienKiemSoat, tenNhaSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
            service.addOto(oto);

        } else if (selectVehicle1 == 3) {
            System.out.println("nhập năng suất");
            String nangSuat = sc.nextLine();
            XeMay xeMay = new XeMay(bienKiemSoat, tenNhaSanXuat, namSanXuat, chuSoHuu, nangSuat);
            service.addXeMay(xeMay);
        }

    }

    public static void display() {
        if (selectVehicle2 == 1) {
            for (int i = 0; i < service.xeTaiList.size(); i++) {
                System.out.println(service.xeTaiList);

            }

        } else if (selectVehicle2 == 2) {
            for (int i = 0; i < service.otoListList.size(); i++) {
                System.out.println(service.otoListList);
            }

        } else if (selectVehicle2 == 3) {
            for (int i = 0; i < service.xeMayList.size(); i++) {
                System.out.println(service.xeMayList);
            }
        }
    }

    public static void remove() {
        String bienKiemSoat;
        System.out.println("nhập biển kiểm soát");
        bienKiemSoat = sc.nextLine();

        if (selectVehicle3 == 1) {
            for (int i = 0; i < service.xeTaiList.size(); i++) {
                if (bienKiemSoat.equals(service.xeTaiList.get(i).getBienKiemSoat())) {
                    service.removeXeTai(i);
                    System.out.println("xóa thành công");
                    break;

                } else {
                    System.out.println("vui long nhập đúng biển số xe");
                }

            }
        } else if (selectVehicle3 == 2) {
            for (int i = 0; i < service.otoListList.size(); i++) {
                if (bienKiemSoat.equals(service.otoListList.get(i).getBienKiemSoat())) {
                    service.removeOto(i);
                    System.out.println("xóa thành công");
                    break;
                } else {
                    System.out.println("vui long nhập đúng biển số xe");
                }

            }
        } else if (selectVehicle3 == 3) {
            for (int i = 0; i < service.xeMayList.size(); i++) {
                if (bienKiemSoat.equals(service.xeMayList.get(i).getBienKiemSoat())) {
                    service.removeXeMay(i);
                    System.out.println("xóa thành công");
                    break;
                } else {
                    System.out.println("vui long nhập đúng biển số xe");
                }

            }
        }

    }

    public static void search() {
        String bienKiemSoat;
        System.out.println("nhập biển kiểm soát");
        bienKiemSoat = sc.nextLine();

        if (selectVehicle4 == 1) {
            for (int i = 0; i < service.xeTaiList.size(); i++) {
                if (bienKiemSoat.equals(service.xeTaiList.get(i).getBienKiemSoat())) {
                    System.out.println(service.xeTaiList.get(i));

                } else {
                    System.out.println("vui long nhập đúng biển số xe");
                }

            }
        } else if (selectVehicle4 == 2) {
            for (int i = 0; i < service.otoListList.size(); i++) {
                if (bienKiemSoat.equals(service.otoListList.get(i).getBienKiemSoat())) {
                    System.out.println(service.otoListList.get(i));
                    break;
                } else {
                    System.out.println("vui long nhập đúng biển số xe");
                }

            }
        } else if (selectVehicle4 == 3) {
            for (int i = 0; i < service.xeMayList.size(); i++) {
                if (bienKiemSoat.equals(service.xeMayList.get(i).getBienKiemSoat())) {
                    System.out.println(service.otoListList.get(i));
                    break;
                } else {
                    System.out.println("vui long nhập đúng biển số xe");
                }

            }
        }

    }


    public static void main(String[] args) {

        do {
            System.out.println("1 Thêm mới phương tiện");
            System.out.println("2 Hiện thị phương tiện");
            System.out.println("3 Xóa phương tiện");
            System.out.println("4 Tìm kiếm theo biển kiểm soát");
            System.out.println("5 Thoát");

            selectChoice = Integer.parseInt(sc.nextLine());

            switch (selectChoice) {
                case 1:
                    System.out.println("1. Thêm xe tải");
                    System.out.println("2. Thêm ôtô");
                    System.out.println("3. Thêm  xe máy");
                    selectVehicle1 = Integer.parseInt(sc.nextLine());
                    switch (selectVehicle1) {
                        case 1:
                            add();

                            break;
                        case 2:
                            add();

                            break;
                        case 3:
                            add();

                            break;
                        default:
                            System.out.println("vui long nhap dung so ");

                    }
                    break;
                case 2:

                    System.out.println("1. Hiện thị xe tải.");
                    System.out.println("2. Hiện thị ôtô");
                    System.out.println("3. Hiện  xe máy");
                    selectVehicle2 = Integer.parseInt(sc.nextLine());
                    switch (selectVehicle2) {
                        case 1:
                            display();
                            break;
                        case 2:
                            display();
                            break;
                        case 3:
                            display();
                            break;
                        default:
                            System.out.println("vui long nhap dung so ");
                    }

                    break;
                case 3:
                    System.out.println("1 Xóa xe tải");
                    System.out.println("2 xóa xe oto");
                    System.out.println("3 xóa xe máy");
                    selectVehicle3 = Integer.parseInt(sc.nextLine());
                    switch (selectVehicle3) {
                        case 1:
                            remove();
                            break;
                        case 2:
                            remove();
                            break;
                        case 3:
                            remove();
                            break;
                        default:
                            System.out.println("vui long nhap dung so ");
                    }
                    break;


                case 4:
                    System.out.println("tìm xe tải");
                    System.out.println("tìm xe oto");
                    System.out.println("tìm xe máy");
                    selectVehicle4 = Integer.parseInt(sc.nextLine());
                    switch (selectVehicle4) {
                        case 1:
                            search();
                            break;
                        case 2:
                            search();
                            break;
                        case 3:
                            search();
                            break;
                        default:
                            System.out.println("vui long nhap dung so ");
                    }

                    break;

                default:
                    System.out.println("vui lòng nhập đúng chức năng");
                    break;
            }
        } while (selectChoice != 5);
    }


}

