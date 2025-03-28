package Responsi;

public class TenagaPendidikan extends Karyawan{
    private static int counterTenagaPendidikan = 0;

    // Konstruktor
    public TenagaPendidikan() {
        super();
        counterTenagaPendidikan++;
    }

    public TenagaPendidikan(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counterTenagaPendidikan++;
    }

    // Selektor counter
    public static int getCounterTenagaPendidikan() {
        return counterTenagaPendidikan;
    }

    // Method menghitung gaji tenaga pendidikan
    public double hitungGaji() {
        return 4000000 + (masaKerja * 0.01 * 4000000);
    }

    // Method untuk menampilkan informasi tenaga pendidikan
    @Override
    public void displayInfo() {
        System.out.println("=====================================");
        super.displayInfo();
        System.out.println("Gaji: " + hitungGaji());
    }
}
