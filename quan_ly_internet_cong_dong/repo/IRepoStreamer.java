package projectmodule2.quan_ly_internet_cong_dong.repo;

import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayCouple;
import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayStreamers;
import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayThuong;
import projectmodule2.quan_ly_internet_cong_dong.ultil.FIleHelperInternet;

import java.util.List;

public interface IRepoStreamer {
    String PATH_STREAM = "F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\quan_ly_internet_cong_dong\\repo\\StreamerFile.dat";
    List<PhongMayStreamers> phongMayStreamersList = FIleHelperInternet.readFIleMayStreams(PATH_STREAM);
    void add(PhongMayStreamers phongMayStreamer);

    void remove(int index);

    void search(int index);

    void displayList();

}
