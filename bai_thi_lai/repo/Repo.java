package projectmodule2.bai_thi_lai.repo;

import projectmodule2.bai_thi_lai.model.BenhAn;
import projectmodule2.bai_thi_lai.ulti.FileHelper;

import java.util.List;

public class Repo implements IRepo {
    String duongDan="F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\bai_thi_lai\\repo\\data_record.csv";

    @Override
    public void themRepo(BenhAn benhAn) {
        List<BenhAn> danhSachBenhAn = FileHelper.readFileHelperBinary(duongDan);
        danhSachBenhAn.add(benhAn);
        FileHelper.writeFileHelperBinary(danhSachBenhAn,duongDan);
    }

    @Override
    public void hienThiRepo() {
        List<BenhAn> danhSachBenhAn = FileHelper.readFileHelperBinary(duongDan);
        for (BenhAn benhAn : danhSachBenhAn) {
            System.out.println(benhAn);
        }
    }

    @Override
    public void xoaRepo(int index) {
        List<BenhAn> danhSachBenhAn = FileHelper.readFileHelperBinary(duongDan);
        danhSachBenhAn.remove(index);
        FileHelper.writeFileHelperBinary(danhSachBenhAn,duongDan);
    }

}
