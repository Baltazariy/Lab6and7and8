package Laba6_2;

public class Poezd {
    private Vagon[] vagons;

    public Poezd(Vagon[] vagons) {
        this.vagons = vagons;
    }

    public void napechatatKolichestvo() {
        int kolichestvoPasagirov = 0;
        int kolichestvoBagaja = 0;

        for (Vagon vagon : vagons) {
            kolichestvoPasagirov += vagon.getKolichestvoPasagirov();
            kolichestvoBagaja += vagon.getKolichestvoBagaja();
        }

        System.out.println("kolichestvoPasagirov = " + kolichestvoPasagirov);
        System.out.println("kolichestvoBagaja = " + kolichestvoBagaja);
    }


    public void setNujnoeKolvoPasajirov(int Ot, int dO) {
        int i = 1;
        int j = 0;
        for (Vagon vagon : vagons) {
            if (vagon.getKolichestvoPasagirov() >= Ot && vagon.getKolichestvoPasagirov() <= dO) {
                System.out.println("Vi ishite " + i + " vagon.");
                j++;
            }
            i++;
        }
        if (j == 0) System.out.println("S takim kolichestvom pasagirov vagonov net.");
    }

    public void sortirovkaVagonovPoPasagiram() {
        int[] kolichestvoPasajirov = new int[vagons.length];
        String[] nomeraVagonov = new String[vagons.length];
        int i = 0;
        for (Vagon vagon : vagons) {
            kolichestvoPasajirov[i] = vagon.getKolichestvoPasagirov();
            nomeraVagonov[i] = vagon.getNomerVagona();
            i++;
        }
        i = 0;
        int tmp1;
        while (i < kolichestvoPasajirov.length - 1) {
            if (kolichestvoPasajirov[i + 1] < kolichestvoPasajirov[i]) {
                tmp1 = kolichestvoPasajirov[i];
                kolichestvoPasajirov[i] = kolichestvoPasajirov[i + 1];
                kolichestvoPasajirov[i + 1] = tmp1;
                String tmp2 = nomeraVagonov[i];
                nomeraVagonov[i] = nomeraVagonov[i + 1];
                nomeraVagonov[i + 1] = tmp2;
                i = 0;
            } else i++;
        }
            System.out.println("Vagoni(Po kolichestvu pasajirov):");
            i=0;
            for(Vagon vagon : vagons){
                System.out.println(nomeraVagonov[i]);
                i++;
            }
        }

    }
