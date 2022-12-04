package TP_MODUL2;

public class Handphone extends Perangkat {
    protected Boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        if (fingerprint) {
            System.out.printf(
                    "Handphone ini memiliki %s Hard Drive dengan %d GB RAM dan %.2f GHz Processor. HandPhone ini termasuk dengan FingerPrint.\n",
                    this.drive, this.ram, this.processor);
        } else {
            System.out.printf(
                    "Handphone ini memliki Hard Drive %s  dengan %d GB RAM dan %.2f GHz Processor. Handphone ini tidak termasuk FingerPrint.\n",
                    this.drive, this.ram, this.processor);
        }
    }

    public void telfon(int no_hp) {
        System.out.printf("Handphone memanggil %d \n", no_hp);
    }

    public void kirimSMS(int no_hp) {
        System.out.printf("Handphone sedang mengirim pesan kepada %d\n", no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.printf("Handphone sedang mengirim pesan kepada %d dan %d\n", no_hp1, no_hp2);
    }
}