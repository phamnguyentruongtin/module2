package projectmodule2.quan_ly_internet_cong_dong.repo;

import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayThuong;
import projectmodule2.quan_ly_internet_cong_dong.ultil.FIleHelperInternet;

import java.util.List;
import java.util.Scanner;

public class RepoNormal implements IRepoNormal {
    String PATH_NORMAL ="F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\quan_ly_internet_cong_dong\\repo\\NormalFile.dat";
    List<PhongMayThuong> phongMayThuongList = FIleHelperInternet.readFIleMayThuong(PATH_NORMAL);

    @Override
    public void add(PhongMayThuong phongMayThuong) {
        phongMayThuongList.add(phongMayThuong);
        FIleHelperInternet.writeFileMayThuong(PATH_NORMAL,phongMayThuongList);
    }

    @Override
    public void remove(int index) {
        phongMayThuongList.remove(index);
        FIleHelperInternet.writeFileMayThuong(PATH_NORMAL,phongMayThuongList);
    }

    @Override
    public void search(int i) {
            System.out.println(phongMayThuongList.get(i));
        }

    @Override
    public void displayList() {
        for (int i = 0; i < phongMayThuongList.size(); i++) {
            System.out.println(phongMayThuongList.get(i).toString());
        }
    }


}
