package projectmodule2.quan_ly_internet_cong_dong.model;

public class PhongMayThuong extends PhongMay{
    private static final double giaThanh = 8000;
    public PhongMayThuong(String taiKhoang, String matKhau, String dichVu, String cauHinh , String khongGian) {
        super(taiKhoang, matKhau, dichVu, cauHinh, khongGian);
    }

    public PhongMayThuong() {
    }

    @Override
    public String toString() {
        return "PhongMayThuong{} " +"gia thanh"+ giaThanh+ super.toString();
    }
}
