package projectmodule2.ss9.baitapthem2.Model;

import java.util.ArrayList;
import java.util.List;

public class XeTai extends Vehicle  {
    private int trongTai;
    List<XeTai> xeTaiList = new ArrayList<XeTai>();
    public XeTai(String bienKiemSoat, String tenNhaSanXuat, int namSanXuat, String chuSoHuu, String trongTai) {
        super(bienKiemSoat, tenNhaSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = Integer.parseInt(trongTai);
    }

    public XeTai(int i) {
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return  super.toString()+ "Tải trọng :"+trongTai ;

    }





}
