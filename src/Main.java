public class Main {
    public static void main(String[] args) {


        Pegawai rio = new Pegawai("Rio Saputra", 3000000.0);

        System.out.println("Pegawai");
//        rio.setNama("Rio Saputra");
//        rio.setGajiPokok(1000000.0);
        rio.cetakInfo();

        System.out.println("--------------------------");

        System.out.println("Manager");
        Manager rehan = new Manager("Wahyu Rahayu", 2000000.0, 500000.0);
//        rehan.setNama("Rehan Pratama");
//        rehan.setTunjangan(4000000.0);
//        rehan.setGajiPokok(1000000.0);
        rehan.cetakInfo();
        rehan.cetakTunjangan();

        System.out.println("---------------------------");

        System.out.println("Programmer");
        Programmer riko = new Programmer("Subastian", 1000000.0, 100000.0);
//        riko.setNama("riko simanjuntak");
//        riko.setBonus(5000000.0);
//        riko.setGajiPokok(1000000.0);
        riko.cetakInfo();
        riko.cetakbonus();

    }

}