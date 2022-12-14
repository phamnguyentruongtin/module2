package projectmodule2.quan_ly_internet_cong_dong.model;

import java.io.Serializable;
import java.util.Objects;

public abstract class PhongMay implements Serializable  {
    private static final long serialVersionUID = 4l;
    private String taiKhoang;
    private String matKhau;
    private String dichVu;
    private String cauHinh;

    private String khongGian;

    public PhongMay(String taiKhoang, String matKhau, String dichVu, String cauHinh, String khongGian) {
        this.taiKhoang = taiKhoang;
        this.matKhau = matKhau;
        this.dichVu = dichVu;
        this.cauHinh = cauHinh;

        this.khongGian = khongGian;
    }


    public PhongMay() {
    }

    public String getTaiKhoang() {
        return taiKhoang;
    }

    public void setTaiKhoang(String taiKhoang) {
        this.taiKhoang = taiKhoang;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public String getCauHinh() {
        return cauHinh;
    }

    public void setCauHinh(String cauHinh) {
        this.cauHinh = cauHinh;
    }

    public String getKhongGian() {
        return khongGian;
    }

    public void setKhongGian(String khongGian) {
        this.khongGian = khongGian;
    }

    @Override
    public String toString() {
        return "PhongMay{" +
                "taiKhoang='" + taiKhoang + '\'' +
                ", matKhau='" + matKhau + '\'' +
                ", dichVu='" + dichVu + '\'' +
                ", cauHinh='" + cauHinh + '\'' +
                ", khoongGian=" + khongGian +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhongMay)) return false;
        PhongMay phongMay = (PhongMay) o;
        return getTaiKhoang().equals(phongMay.getTaiKhoang());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaiKhoang());
    }
}
