package Laba6_2;

import Lab8.KolichestvoPasagirovException;

public class Main {
    public static void main(String[] args) throws KolichestvoPasagirovException{
        Vagon[] vagons = new Vagon[4];
        vagons[0] = new Kupe(23, 3,"1");
        vagons[1] = new Plackart(15, 15,"2");
        vagons[2] = new Liuks(12,2,"3");
        vagons[3] = new Plackart(20,24,"4");
        vagons[4] = new Plackart(80,24,"5");

        Poezd poezd = new Poezd(vagons);
        poezd.napechatatKolichestvo();
        poezd.setNujnoeKolvoPasajirov(10,12);
        poezd.sortirovkaVagonovPoPasagiram();
    }
}