package projectmodule2.ss9.baitapthem2.Model;

import java.util.ArrayList;
import java.util.List;

public class XeMay extends Vehicle  {
    private String congSuat;

    public XeMay() {
        super();
    }

    public XeMay(String bienKiemSoat, String tenNhaSanXuat, int namSanXuat, String chuSoHuu, int namSanXuat1) {
    }

    public String getCongSuat() {
        return congSuat;
    }
    List<XeMay> xeMayList = new ArrayList<XeMay>();


    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String tenNhaSanXuat, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenNhaSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return  super.toString()
                 + congSuat  ;

    }


}
