package MODUL2_FANANDRI;

public class kapal extends TransportasiAir {

    protected String mesin;

    public kapal(int jumlahkursi, int biaya, String mesin) {
        super(jumlahkursi, biaya);
        this.mesin = mesin;

    }

    @Override
    public void informasi() {
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah " + jumlahkursi
                + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }

    @Override
    public void berlayar() {
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan" + mesin
                + "dengan kecepatan yang tidak stabil");
    }

    public void berlayar(int kecepatan) {
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan" + mesin
                + "dengan kecepatan Stabil di kisaran" + kecepatan + "knot");
    }

    @Override
    public void berlabuh() {
        System.out.println("Transportasi Air jenis kapal berlabuh di pantai");
    }
}
