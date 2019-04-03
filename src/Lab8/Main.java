package Lab8;
import Laba6_2.Kupe;
import Laba7.MyList;

public class Main {
    public static void main(String[] args) throws KolichestvoPasagirovException {
        try {
            new MyList().add(new Kupe(17, 34,"1"));
            System.out.println(":)");
        } catch (KolichestvoBagajaException e) {

            System.out.println(e.getMessage());
        } catch (NomerVagonaException e) {

            System.out.println(e.getMessage());
        }

    }
}
