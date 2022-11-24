public class Manager extends Pegawai {

    private double tunjangan = 0.0 ;

    public Manager(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    public Manager(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void cetakTunjangan(){
        System.out.println("Tunjangan Untuk Manager Sebesar Rp." + this.tunjangan);
    }

    public void cetakInfo(){
        System.out.println("Nama :" + getNama());
        System.out.println("Gaji Pokok :" + getGajiPokok());
        System.out.println("Tunjangan :" + getTunjangan());
    }


}