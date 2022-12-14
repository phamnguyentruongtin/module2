package projectmodule2.caseStudy.ulti;

import projectmodule2.caseStudy.Model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static List<Person> readFile(String PATH) {
        List<Person> personList = new ArrayList<>();
        File file = new File(PATH);
        ObjectInputStream objectInputStream = null;
        try {
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(PATH);
                objectInputStream = new ObjectInputStream(fis);
                personList = (List<Person>) objectInputStream.readObject();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (EOFException e) {
            System.err.println("không có data");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return personList;
    }

    public static void writeFile(String path, List<Person> personList) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(personList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.err.println("không có data");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }
    }
}

