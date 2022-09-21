package projectmodule2.ss15;

import java.io.*;

public class FileCopy {
    public static void copyFile(String inputFile, String outputFile) throws IOException {
        FileReader fr = null;
        BufferedReader bufferedReader = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
         fr = new FileReader(inputFile);
         bufferedReader = new BufferedReader(fr);
         fw = new FileWriter(outputFile);
         bw = new BufferedWriter(fw);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            bufferedReader.close();
            bw.close();
        }
    }

    public static void main(String[] args) throws IOException {
        copyFile("F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\ss15\\Tin.csv","F:\\CODEGYM\\module2\\project module2\\src\\projectmodule2\\ss15\\TIn2.csv");
    }
}
