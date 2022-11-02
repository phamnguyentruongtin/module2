package oop_lon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
//        ghiFile(list);
        docFile();
    }

    private static void ghiFile(ArrayList<String> list) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
            for (String string : list) {
                bw.write(string);
                bw.newLine();
            }
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void docFile() {
        List<String> a = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("out.txt"));
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                a.add(line);
            }
            System.out.println(a);
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

