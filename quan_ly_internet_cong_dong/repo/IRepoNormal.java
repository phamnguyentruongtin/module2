package projectmodule2.quan_ly_internet_cong_dong.repo;

import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayCouple;
import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayThuong;
import projectmodule2.quan_ly_internet_cong_dong.ultil.FIleHelperInternet;

import java.util.List;

public interface IRepoNormal {
    String PATH_NORMAL = "F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\quan_ly_internet_cong_dong\\repo\\NormalFile.dat";
    List<PhongMayThuong> phongMayThuongList = FIleHelperInternet.readFIleMayThuong(PATH_NORMAL);
    void add(PhongMayThuong phongMayThuong);
    void remove(int index);
    void search(int index);
    void displayList();

}
