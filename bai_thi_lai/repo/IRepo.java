package projectmodule2.bai_thi_lai.repo;

import projectmodule2.bai_thi_lai.model.BenhAn;
import projectmodule2.bai_thi_lai.ulti.FileHelper;

import java.util.List;

public interface IRepo {
   String duongDan="F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\bai_thi_lai\\repo\\data_record.csv";
   List<BenhAn> danhSachBenhAn = FileHelper.readFileHelperBinary(duongDan);
   void themRepo(BenhAn benhAn);
   void hienThiRepo();
   void xoaRepo(int index);
}
