package projectmodule2.doc_ghi_file;

import java.io.*;

public class FileHelper {

    private Exception exception;

public void writeFile(String path, Object o) {

        try (ObjectOutputStream outputStream =
        new ObjectOutputStream(
        new FileOutputStream(path))) {
        outputStream.writeObject(o);
        outputStream.flush();
        } catch (IOException e) {
        e.printStackTrace();
        }
        }


public Object readFile(String path) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(path))) {

        return input.readObject();
        } catch (IOException | ClassNotFoundException e) {
        e.getMessage();
        }
        return null;
        }
}