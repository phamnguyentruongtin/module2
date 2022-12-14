package projectmodule2.quan_ly_internet_cong_dong.repo;

import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayCouple;
import projectmodule2.quan_ly_internet_cong_dong.ultil.FIleHelperInternet;

import java.util.List;


public class RepoCouple implements IRepoCouple {
    String PATH_COUPLE = "F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\quan_ly_internet_cong_dong\\repo\\CoupleFile.dat";
    List<PhongMayCouple> phongMayCoupleList = FIleHelperInternet.readFIleMayCouple(PATH_COUPLE);

    @Override
    public void add(PhongMayCouple phongMayCouple) {
        phongMayCoupleList.add(phongMayCouple);
        FIleHelperInternet.writeFileMayCouple(PATH_COUPLE,phongMayCoupleList);
    }

    @Override
    public void remove(int index) {
        phongMayCoupleList.remove(index);
        FIleHelperInternet.writeFileMayCouple(PATH_COUPLE,phongMayCoupleList);
    }

    @Override
    public void search(int index) {
        System.out.println(index);
    }

    @Override
    public void displayList() {
        for (int i = 0; i < phongMayCoupleList.size(); i++) {
            System.out.println(phongMayCoupleList.get(i));
        }
    }
}
