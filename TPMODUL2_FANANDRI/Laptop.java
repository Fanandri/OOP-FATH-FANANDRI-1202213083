package TP_MODUL2;

public class Laptop extends Perangkat {
    protected Boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        if (webcam) {
            System.out.printf(
                    "Laptop ini memiliki %s Hard Drive dengan %d GB RAM dan %.2f GHz Processor. Laptop ini sudah dengan Webcam.\n",
                    this.drive, this.ram, this.processor);
        } else {
            System.out.printf(
                    "Laptop ini memiliki %s Hard Drive dengan %d GB RAM dan %.2f GHz Processor. Laptop ini belum termasuk dengan Webcam.\n",
                    this.drive, this.ram, this.processor);
        }
    }

    public void bukaGame(String nama_game) {
        System.out.printf("Membuka %s Tunggu Sebentar...\n", nama_game);
    }

    public void kirimEmail(String email) {
        System.out.printf("Mengirim email kepada %s\n", email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.printf("Mengirim email kepada %s dan %s\n", email1, email2);
    }
}
