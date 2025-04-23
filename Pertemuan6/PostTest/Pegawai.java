package Pertemuan6.PostTest;

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    // Konstruktor  
    public Pegawai() {
        this.nama = "";
    }

    public Pegawai(String nama) {
        this.nama = nama;
    }

    // Selektor 
    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    // Mutator 
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

 