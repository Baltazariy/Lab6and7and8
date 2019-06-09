package lab9;

import Laba6_2.Kupe;
import Laba6_2.Liuks;
import Laba6_2.Plackart;
import Laba7.MyList;
import Laba6_2.Vagon;

import java.io.*;
import java.util.ArrayList;

public class FileWorker {

    public static void saveCollectionToFile(String fileName, MyList myList) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(myList);
            objectOutputStream.close();
            System.out.println(": )");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry. File was not found.");
        } catch (IOException e) {
            System.out.println("Sorry. Problems with writing in the file.");
        }
    }

    public static MyList loadCollectionFromFile(String fileName) {
        File file = new File(fileName);
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            return (MyList) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveObjectsToFile(String fileName, MyList myList) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            for (Vagon vagon : myList) {
                objectOutputStream.writeObject(vagon);
            }
            objectOutputStream.close();
            System.out.println(":2)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Vagon[] loadObjectsFromFile(String fileName) {
        File file = new File(fileName);
        ArrayList<Vagon> vagons =
                new ArrayList<>();
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Vagon vagon = (Vagon) objectInputStream.readObject();
            while (true) {
                vagons.add(vagon);
                vagon = (Vagon) objectInputStream.readObject();


            }

        } catch (IOException | ClassNotFoundException e) {
        }
        return vagons.toArray(new Vagon[0]);
    }

    public static void saveSymbolToTextFile
            (String fileName, char symbol) throws IOException {
        OutputStream outputStream = new FileOutputStream(fileName);
        outputStream.write(symbol);
    }

    public static void saveStringToTextFile
            (String fileName, String string) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(string);
        fileWriter.close();
    }

    public static void saveObjectsToTextFilePorschee(String fileName,Liuks[] liuks1) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Liuks liuks : liuks1) {
            fileWriter.write(liuks.toString() + "\n");
        }
        fileWriter.close();
    }
    public static void saveObjectsToTextFileLada(String fileName, Kupe[] kupes) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Kupe kupe : kupes) {
            fileWriter.write(kupe.toString() + "\n");
        }
        fileWriter.close();
    }
    public static void saveObjectsToTextFileSubary(String fileName, Plackart[] plackarts) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Plackart plackart : plackarts) {
            fileWriter.write(plackart.toString() + "\n");
        }
        fileWriter.close();
    }
}