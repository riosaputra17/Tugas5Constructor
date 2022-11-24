public class Programmer extends Pegawai {


    private double bonus = 0.0;

    public Programmer(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    public Programmer(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void cetakInfo() {
        System.out.println("Nama :" + getNama());
        System.out.println("Gaji Pokok :" + getGajiPokok());
        System.out.println("Bonus :" + getBonus());
    }

    public void cetakbonus() {
        System.out.println("bonus Untuk Programmer Sebesar Rp." + this.bonus);
    }
}
