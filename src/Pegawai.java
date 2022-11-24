import java.math.BigDecimal;

public class Pegawai {

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    private String nama = "";

    private double gajiPokok = 0.0;


    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return this.gajiPokok;
    }

    public void cetakInfo() {
        System.out.println("Nama :" + getNama());
        System.out.println("Gaji Pokok :" + getGajiPokok());
    }
}

