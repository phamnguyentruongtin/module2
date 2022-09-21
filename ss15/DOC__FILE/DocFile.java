package projectmodule2.ss15.DOC__FILE;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocFile {
    public static  List<Country> readFiles(String filePath) throws IOException {
        List<Country> countryList = new ArrayList<>();
        BufferedReader reader = null;
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            reader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] string = line.split(",");
                int id = Integer.parseInt(string[0]);
                String code = string[1];
                String name = string[2];
                Country country = new Country(id,code,name);
                countryList.add(country);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countryList;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\ss15\\DOC__FILE\\Tin.csv";
        List<Country> countryList = readFiles(filePath);
        for (Country country : countryList) {
            System.out.println(country.toString());
        }
    }
}


