package Laba6_2;

import Lab8.KolichestvoPasagirovException;
import Lab8.KolichestvoBagajaException;
import Lab8.NomerVagonaException;

public class Liuks extends Vagon {
    public Liuks(int kolichestvoPasagirov, int kolichestvoBagaja, String nomerVagona)throws KolichestvoPasagirovException,
            KolichestvoBagajaException, NomerVagonaException {
        super(kolichestvoPasagirov, kolichestvoBagaja, nomerVagona);
    }
}
