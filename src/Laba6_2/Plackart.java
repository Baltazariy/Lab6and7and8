package Laba6_2;

import Lab8.KolichestvoPasagirovException;
import Lab8.KolichestvoBagajaException;
import Lab8.NomerVagonaException;

public class Plackart extends Vagon {

    public Plackart(int kolichestvoPasagirov, int kolichestvoBagaja, String nomerVagona)throws KolichestvoPasagirovException,
            KolichestvoBagajaException, NomerVagonaException {
        super(kolichestvoPasagirov, kolichestvoBagaja, nomerVagona);
    }
}

