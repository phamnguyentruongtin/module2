package projectmodule2.bai_thi_lai.model;

public class BenhAnDacBiet extends BenhAn{
    private String loaiHang;
    private String thoiHan;

    public BenhAnDacBiet(String maBenhAn, int soThuTu, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiHang, String thoiHan) {
        super(maBenhAn, soThuTu, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiHang = loaiHang;
        this.thoiHan = thoiHan;
    }

    @Override
    public String toString() {
        return "BenhAnDacBiet{" +
                "loaiHang='" + loaiHang + '\'' +
                ", thoiHan='" + thoiHan + '\'' +
                "} " + super.toString();
    }

    @Override
    public void BenhAn() {

    }
}
