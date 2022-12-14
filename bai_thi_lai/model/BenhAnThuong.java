package projectmodule2.bai_thi_lai.model;

public class BenhAnThuong extends BenhAn{
    private Double phiNamVien;

    public BenhAnThuong(String maBenhAn, int soThuTu, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, Double phiNamVien) {
        super(maBenhAn, soThuTu, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    @Override
    public void BenhAn() {

    }

    public Double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(Double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "phiNamVien=" + phiNamVien +
                "} " + super.toString();
    }

}
