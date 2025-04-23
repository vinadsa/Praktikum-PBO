package Pertemuan6.PostTest;

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    // Konstruktor non-parameter
    public Manajer() {
        super();
    }

    // Konstruktor parameter
    public Manajer(String nama) {
        super(nama);
    }

    // Selektor (getter) untuk tunjangan
    public int getTunjangan() {
        return tunjangan;
    }

    // Mutator (setter) untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void tampilData() {
        super.tampilData(); // Memanggil metode tampilData() dari kelas Pegawai
        System.out.println("Tunjangan: " + tunjangan);
    }
}
