package TP_MODUL2;

public class Perangkat {
    protected String drive;
    protected Integer ram;
    protected Float processor;

    public Perangkat(String drive, int ram, float processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi() {
        System.out.printf(
                "Perangkat tidak dikenal ini memiliki %s Hard Drive dengan %d GB RAM dan %.2f GHz Processor.\n",
                this.drive, this.ram, this.processor);
    }
}
