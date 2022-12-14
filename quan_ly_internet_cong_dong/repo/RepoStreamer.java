package projectmodule2.quan_ly_internet_cong_dong.repo;

import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayStreamers;
import projectmodule2.quan_ly_internet_cong_dong.ultil.FIleHelperInternet;

import java.util.List;

public class RepoStreamer implements IRepoStreamer {
    String PATH_STREAMER = "F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\quan_ly_internet_cong_dong\\repo\\StreamerFile.dat";
    List<PhongMayStreamers> phongMayStreamersList = FIleHelperInternet.readFIleMayStreams(PATH_STREAM);
    @Override
    public void add(PhongMayStreamers phongMayStreamer) {
        phongMayStreamersList.add(phongMayStreamer);
        FIleHelperInternet.writeFileMayStreamer(PATH_STREAMER,phongMayStreamersList);
    }

    @Override
    public void remove(int index) {
        phongMayStreamersList.remove(index);
        FIleHelperInternet.writeFileMayStreamer(PATH_STREAMER,phongMayStreamersList);
    }

    @Override
    public void search(int index) {
           System.out.println(phongMayStreamersList.get(index).toString());
    }

    @Override
    public void displayList() {
        for (int i = 0; i < phongMayStreamersList.size();i++) {
            System.out.println(phongMayStreamersList.get(i));
        }
    }

}
