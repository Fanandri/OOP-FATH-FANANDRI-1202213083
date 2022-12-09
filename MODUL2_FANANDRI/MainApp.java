package MODUL2_FANANDRI;

public class MainApp {

    public static void main(String[] args) throws Exception {

        TransportasiAir tair1 = new TransportasiAir(4, 20000);
        tair1.informasi();
        tair1.berlayar();
        tair1.berlabuh();
        System.out.println("");

        Sampan sampan1 = new Sampan(20, 50000, 2);
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlabuh();
        sampan1.berlabuh(2);
        System.out.println("");

        kapal kapal1 = new kapal(50, 100000, "Diesel");
        kapal1.informasi();
        kapal1.berlayar();
        kapal1.berlayar(20);
        kapal1.berlabuh();
        System.out.println("");
    }

}
