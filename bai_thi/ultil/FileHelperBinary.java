package projectmodule2.bai_thi.ultil;

import projectmodule2.bai_thi.model.DienThoai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelperBinary {
    public static void writeFileHelperBinary(List<DienThoai> dienThoaiList, String path) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dienThoaiList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<DienThoai> readFileHelperBinary(String path) {
        List<DienThoai> dienThoaiList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            dienThoaiList = (List<DienThoai>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.err.println("Không có data");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return dienThoaiList;
    }


}
