package projectmodule2.bai_thi.repo;

import projectmodule2.bai_thi.model.DienThoai;
import projectmodule2.bai_thi.ultil.FileHelperBinary;

import java.util.Collection;
import java.util.List;

public interface IRepostory {
    String PATH = "F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\bai_thi\\repo\\data_record.csv";
    List<DienThoai> dienThoaiList = FileHelperBinary.readFileHelperBinary(PATH);
    void themMoi(DienThoai dienThoai);
    void hienThi();
    void timKiem(int id);
    void xoa(int id);

    
}
