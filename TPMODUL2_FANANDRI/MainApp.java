package TP_MODUL2;

public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("<<< Daftar Pengidentifikasi Perangkat >>>");
        Perangkat unknown = new Perangkat("SATA", 512, 3.38F);
        unknown.informasi();
        System.out.println("");
        Laptop laptop = new Laptop("WD", 256, 5.72F, false);
        laptop.informasi();
        laptop.bukaGame("Valorant");
        laptop.kirimEmail("fanandri69@gmail.com");
        laptop.kirimEmail("killua99@yahoo.com", "gojosatoru@gmail.com");
        System.out.println("");
        Handphone hp = new Handphone("Snapdragon", 4, 4.73F, true);
        hp.informasi();
        hp.telfon(628123456);
        hp.kirimSMS(628123456);
        hp.kirimSMS(628123456, 628765432);
    }
}
