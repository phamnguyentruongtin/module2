package oop_lon.baitap2.so_giao_thong;

public class Serrvices implements IServ {

    @Override
    public void them() {
        System.out.println("nhap ten chu xe ");
        String tenChuxe = sc.nextLine();
        System.out.println("nhap loai xe");
        String loaiXe = sc.nextLine();
        System.out.println("nhap dung tich xe");
        int dungTichXe = Integer.parseInt(sc.nextLine());
        System.out.println("nhap tri gia xe");
        double giaTri = Double.parseDouble(sc.nextLine());
        double thue;
        if ((dungTichXe<=100)){
            thue = giaTri / 100;
        }else  if ((dungTichXe >= 100 && dungTichXe<=200 )) {
            thue = giaTri * 0.03;
        }else {
            thue = giaTri * 0.05;
        }
        Vehicle vh = new Vehicle(tenChuxe,loaiXe,dungTichXe,giaTri,thue);
        vehicleList.add(vh);
    }

    @Override
    public void xuatKeTienThue() {
        for (int i = 0; i <vehicleList.size(); i++ ) {
            System.out.println(vehicleList.get(i).getThuePhaiNop());
        }
    }

    @Override
    public void indanhsachtheoloai(String loaiXe) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getLoaiXe() == loaiXe) {
                System.out.println(vehicleList.get(i));
            }
        }
    }

    @Override
    public void indanhsachgiatrilon() {
         int max = 0;
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(max).getTriGia() < vehicleList.get(i).getTriGia()){
                max = i;
            }
        }
        System.out.println("xe co gia tri lon nhat la :" + vehicleList.get(max).toString());
    }
}
