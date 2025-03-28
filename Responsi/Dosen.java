package Responsi;

public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counterDosen = 0;

    // Konstruktor
    public Dosen() {
        super();
        this.fakultas = null;
        counterDosen++;
    }

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counterDosen++;
    }

    // Selektor
    public Fakultas getFakultas() {
        return fakultas;
    }

    // Mutator
    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    // Method menghitung gaji dosen
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * 0.01 * fakultas.getGajiPokok());
    }
    
    // Method untuk menampilkan informasi dosen
    @Override
    public void displayInfo() {
        System.out.println("=====================================");
        super.displayInfo();
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Gaji: " + hitungGaji());
    }

    // Selektor counter
    public static int getCounterDosen() {
        return counterDosen;
    }
}
