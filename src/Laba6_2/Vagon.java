package Laba6_2;

import Lab8.KolichestvoPasagirovException;
import Lab8.KolichestvoBagajaException;
import Lab8.NomerVagonaException;

public class Vagon {
    private int kolichestvoPasagirov;
    private int kolichestvoBagaja;
    private String nomerVagona;

    public Vagon(int kolichestvoPasagirov, int kolichestvoBagaja,String nomerVagona)throws KolichestvoPasagirovException,
            KolichestvoBagajaException, NomerVagonaException {
        if (kolichestvoPasagirov <= 0 || kolichestvoPasagirov>54) {
            throw new KolichestvoPasagirovException("Увага!Кількість пасажирів <=0 або >54");
        }
        if (kolichestvoBagaja <= 0 || kolichestvoBagaja>5400) {
            throw new KolichestvoBagajaException("Увага!Маса багажу <=0 або > 5400кг");
        }
        if (nomerVagona == null) {
            throw new NomerVagonaException("Не може бути вагон без номеру");
        }
        this.kolichestvoPasagirov = kolichestvoPasagirov;
        this.kolichestvoBagaja = kolichestvoBagaja;
        this.nomerVagona = nomerVagona;
    }

    public int getKolichestvoPasagirov() {
        return kolichestvoPasagirov;
    }

    public int getKolichestvoBagaja() {
        return kolichestvoBagaja;
    }

    public String getNomerVagona() {
        return nomerVagona;
    }


}
