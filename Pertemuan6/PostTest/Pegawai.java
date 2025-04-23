package Pertemuan6.PostTest;

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    // Constructor tanpa parameter
    public Pegawai() {
        this.nama = "Tidak Diketahui";
    }

    // Constructor dengan parameter
    public Pegawai(String nama) {
        this.nama = nama;
    }

    // Selektor (getter) untuk nama
    public String getNama() {
        return nama;
    }

    // Selektor (getter) untuk gajiPokok
    public int getGajiPokok() {
        return gajiPokok;
    }

    // Mutator (setter) untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mutator (setter) untuk gajiPokok
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

// Buatlah konstruktor non parameter, parameter, dan selektor mutator nya. Dipisah masing-masing