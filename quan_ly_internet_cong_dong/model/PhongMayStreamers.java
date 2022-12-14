package projectmodule2.quan_ly_internet_cong_dong.model;

public class PhongMayStreamers extends PhongMay{
    private static final double giaThanh = 20000;
    public PhongMayStreamers(String taiKhoang, String matKhau, String dichVu, String cauHinh, String khongGian) {
        super(taiKhoang, matKhau, dichVu, cauHinh, khongGian);
    }

    public PhongMayStreamers() {
    }

    @Override
    public String toString() {
        return "PhongMayStreamers{} " + "gia thanh"+ giaThanh+ super.toString();
    }
}
