package Laba6_2;

import Lab8.KolichestvoBagajaException;
import Lab8.KolichestvoPasagirovException;
import Lab8.NomerVagonaException;
import org.junit.Test;

public class TestException {
    @Test(expected = KolichestvoPasagirovException.class)
    public void testCapacityException() throws NomerVagonaException {
        Vagon vagon = new Plackart(80,23,"1");
    }

    @Test(expected = KolichestvoBagajaException.class)
    public void testCostException() throws NomerVagonaException {
        Vagon vagon = new Plackart(23,-40,"1");
    }
}