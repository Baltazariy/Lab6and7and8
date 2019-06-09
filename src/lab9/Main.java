package lab9;
import Laba6_2.Kupe;
import Laba6_2.Liuks;
import Laba6_2.Plackart;
import Laba7.MyList;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MyList vagons = new MyList();
        Kupe vagon1 = new Kupe(50, 100, "1");
        vagons.add(vagon1);
        Kupe vagon2 = new Kupe(52, 116, "2");
        vagons.add(vagon2);
        Kupe[] kupes = {vagon1, vagon2};
        FileWorker.saveObjectsToTextFileLada("1.txt", kupes);
        Plackart plackart = new Plackart(52, 104, "3");
        vagons.add(vagon1);
        Plackart plackart1 = new Plackart(51, 102, "4");
        vagons.add(vagon2);
        Plackart[] plackarts = {plackart, plackart1};
        FileWorker.saveObjectsToTextFileSubary("2.txt", plackarts);
        Liuks liuks = new Liuks(53, 106, "5");
        vagons.add(liuks);
        Liuks liuks1 = new Liuks(53, 110, "6");
        vagons.add(vagon2);
        Liuks[] liuks2 = {liuks, liuks1};
        FileWorker.saveObjectsToTextFilePorschee("3.txt",liuks2 );
        System.out.println("File was recorded");

    }
}