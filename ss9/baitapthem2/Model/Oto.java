package projectmodule2.ss9.baitapthem2.Model;

import java.util.ArrayList;
import java.util.List;

public class Oto extends Vehicle  {
    private int soChoNgoi;
    private String kieuXe;

    List<Oto> otoList = new ArrayList<Oto>();

    public Oto(String bienKiemSoat, String tenNhaSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi) {
        super(bienKiemSoat, tenNhaSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienKiemSoat, String tenNhaSanXuat, int namSanXuat, String chuSoHuu, String soChoNgoi, String kieuXe) {
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +
                super.toString() +
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                " ";
    }





}
