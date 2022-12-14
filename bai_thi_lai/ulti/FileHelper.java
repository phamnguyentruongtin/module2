package projectmodule2.bai_thi_lai.ulti;

import projectmodule2.bai_thi.model.DienThoai;
import projectmodule2.bai_thi_lai.model.BenhAn;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static void writeFileHelperBinary(List<BenhAn> danhSachBenhAn, String duongDan) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(duongDan);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(danhSachBenhAn);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<BenhAn> readFileHelperBinary(String path) {
        List<BenhAn> danhSachBenhAn = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            danhSachBenhAn = (List<BenhAn>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.err.println("Không có data");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return danhSachBenhAn;
    }
//    public List<PhoneFake> readFile(String filePath) {
//        List<PhoneFake> phoneFakeList =new ArrayList<>();
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        try {
//            fileReader = new FileReader(filePath);
//            bufferedReader = new BufferedReader(fileReader);
//            String line;
//            String[] temp;
//            while ((line = bufferedReader.readLine()) != null) {
//                temp = line.split(",");
//                int id = Integer.parseInt(temp[0]);
//                String tensanpham = temp[1];
//                double gia = Double.parseDouble(temp[2]);
//                int soluong = Integer.parseInt(temp[3]);
//                String nhasanxuat = temp[4];
//                String quocgaixachtay = temp[5];
//                String trangthai = temp[6];
//                PhoneFake phoneFake = new PhoneFake(id, tensanpham, gia, soluong, nhasanxuat, quocgaixachtay, trangthai);
//                phoneFakeList.add(phoneFake);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException e) {
//                throw new RuntimeException();
//            }
//        }
//        return phoneFakeList;
//    }
//    public void writeFile(String filePath,List<PhoneFake>phoneFakeList) {
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(filePath);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            String str = "";
//            for (PhoneFake phoneFake : phoneFakeList) {
//                str += phoneFake.getId() + "," + phoneFake.getTensanpham() + "," + phoneFake.getGia() + "," + phoneFake.getSoluong() + "," +
//                        phoneFake.getNhasanxuat() + "," + phoneFake.getQuocgiaxachtay() + "," + phoneFake.getTrangthai() + "\n";
//            }
//            if (str != null && !str.isEmpty()) {
//                bufferedWriter.write(str);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException();
//        } finally {
//            try {
//                bufferedWriter.close();
//            } catch (IOException e) {
//                throw new RuntimeException();
//            }
//
//        }
}
