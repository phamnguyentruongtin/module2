package projectmodule2.bai_thi.repo;

import projectmodule2.bai_thi.model.DienThoai;
import projectmodule2.bai_thi.ultil.FileHelperBinary;

import java.util.List;

public class Repostory implements IRepostory {
    String PATH = "F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\bai_thi\\repo\\data_record.csv";
    List<DienThoai> dienThoaiList = FileHelperBinary.readFileHelperBinary(PATH);


    @Override
    public void themMoi(DienThoai dienThoai) {
        dienThoaiList.add(dienThoai);
        FileHelperBinary.writeFileHelperBinary(dienThoaiList, PATH);
    }

    @Override
    public void hienThi() {
        if (dienThoaiList.size() == 0) {
            System.out.println("danh sach rong");
        } else {
            for (int i = 0; i < dienThoaiList.size(); i++) {
                System.out.println(dienThoaiList.get(i));
            }
        }
    }

    @Override
    public void timKiem(int id) {
        System.out.println(dienThoaiList.get(id));
    }

    @Override
    public void xoa(int id) {
        dienThoaiList.remove(id);
        FileHelperBinary.writeFileHelperBinary(dienThoaiList, PATH);
    }
}
