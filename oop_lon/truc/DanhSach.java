package oop_lon.truc;

import java.util.ArrayList;
import java.util.List;

public class DanhSach {
   static List<Double> hinhList = new ArrayList<>();

    public DanhSach(List<Double> hinhList) {
        this.hinhList = hinhList;
    }

    public DanhSach() {
    }

    public List<Double> getHinhList() {
        return hinhList;
    }

    public void setHinhList(List<Double> hinhList) {
        this.hinhList = hinhList;
    }

}
