package projectmodule2.quan_ly_internet_cong_dong.repo;

import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayCouple;
import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayThuong;
import projectmodule2.quan_ly_internet_cong_dong.ultil.FIleHelperInternet;

import java.util.List;

public interface IRepoCouple {
    String PATH_COUPLE = "F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\quan_ly_internet_cong_dong\\repo\\CoupleFile.dat";
    List<PhongMayCouple> phongMayCoupleList = FIleHelperInternet.readFIleMayCouple(PATH_COUPLE);

    void add(PhongMayCouple phongMayCouple);
    void remove(int index);
    void search(int index);
    void displayList();
}
