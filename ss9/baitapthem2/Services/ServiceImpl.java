package projectmodule2.ss9.baitapthem2.Services;

import projectmodule2.ss9.baitapthem2.Model.Oto;
import projectmodule2.ss9.baitapthem2.Model.XeMay;
import projectmodule2.ss9.baitapthem2.Model.XeTai;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl {
    public List<XeTai> xeTaiList = new ArrayList<XeTai>();
    public List<Oto> otoListList = new ArrayList<Oto>();
    public List<XeMay> xeMayList = new ArrayList<XeMay>();

    public void addVehicleXeTai(XeTai xeTai) {
        xeTaiList.add(xeTai);

    }

    public void addOto(Oto oto) {
        otoListList.add(oto);
    }

    public void addXeMay(XeMay xeMay) {
        xeMayList.add(xeMay);
    }

    public void removeXeMay(int xeMay){
        xeMayList.remove(xeMay);
    }
    public void removeXeTai(int xeTai){
        xeTaiList.remove(xeTai);
    }
    public void removeOto(int oto){
        otoListList.remove(oto);
    }
}
