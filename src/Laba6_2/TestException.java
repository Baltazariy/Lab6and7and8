package Laba6_2;

import Lab8.KolichestvoBagajaException;
import Lab8.KolichestvoPasagirovException;
import Lab8.NomerVagonaException;
import org.junit.Test;

public class TestException {
    @Test(expected = KolichestvoPasagirovException.class)
    public void KolichestvoPasagirovException() throws NomerVagonaException {
        Vagon vagon = new Plackart(80,23,"1");
    }

    @Test(expected = KolichestvoBagajaException.class)
    public void KolichestvoBagajaException() throws NomerVagonaException {
        Vagon vagon = new Plackart(23,-40,"1");
    }
    @Test(expected = NomerVagonaException.class)
    public void NomerVagonaException() throws NomerVagonaException {
        Vagon vagon = new Plackart(50,23,null);
    }
}