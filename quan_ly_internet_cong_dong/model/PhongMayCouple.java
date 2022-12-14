package projectmodule2.quan_ly_internet_cong_dong.model;

import java.util.Comparator;

public class PhongMayCouple extends PhongMay {
    private static final double giaThanh = 15000;

    public PhongMayCouple(String taiKhoang, String matKhau, String dichVu, String cauHinh, String khongGian) {
        super(taiKhoang, matKhau, dichVu, cauHinh, khongGian);
    }

    public PhongMayCouple() {
    }

    @Override
    public String toString() {
        return "PhongMayCouple{} " + super.toString() + "gia thanh"+ giaThanh;
    }
}
