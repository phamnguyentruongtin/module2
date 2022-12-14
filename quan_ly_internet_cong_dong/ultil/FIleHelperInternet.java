package projectmodule2.quan_ly_internet_cong_dong.ultil;

import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayCouple;
import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayStreamers;
import projectmodule2.quan_ly_internet_cong_dong.model.PhongMayThuong;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FIleHelperInternet {
    public static void writeFileMayThuong(String path, List<PhongMayThuong> phongMayThuongList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(phongMayThuongList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void writeFileMayCouple(String path, List<PhongMayCouple> phongMayCoupleList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(phongMayCoupleList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void writeFileMayStreamer(String path, List<PhongMayStreamers> phongMayStreamersList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(phongMayStreamersList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static List<PhongMayThuong> readFIleMayThuong(String path) {
        List<PhongMayThuong> phongMayThuongList = new ArrayList<>();

        try {
            FileInputStream   fis = new FileInputStream(path);
            ObjectInputStream   ois = new ObjectInputStream(fis);
            phongMayThuongList = (List<PhongMayThuong>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (EOFException e){
            System.err.println("data phong may thuong khong co du lieu");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }

        return phongMayThuongList;
    }
    public static List<PhongMayCouple>readFIleMayCouple(String pathCoupled) {
        List<PhongMayCouple> phongMayCoupleList = new ArrayList<>();
        FileInputStream fis ;
        ObjectInputStream ois ;
        try {
            fis = new FileInputStream(pathCoupled);
            ois = new ObjectInputStream(fis);
            phongMayCoupleList = (List<PhongMayCouple>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (EOFException e){
            System.err.println("data phong may couple khong co du lieu");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return phongMayCoupleList;
    }

    public static List<PhongMayStreamers> readFIleMayStreams(String pathStream) {
        List<PhongMayStreamers> phongMayStreamersList = new ArrayList<>();
        FileInputStream fis ;
        ObjectInputStream ois ;
        try {
            fis = new FileInputStream(pathStream);
            ois = new ObjectInputStream(fis);
            phongMayStreamersList = (List<PhongMayStreamers>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (EOFException e){
            System.err.println("data phong may stream khong co du lieu");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return phongMayStreamersList;
    }
}
