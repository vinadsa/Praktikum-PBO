package Pertemuan6.PostTest;

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    // Konstruktor 
    public Manajer() {
        super();
    }

    public Manajer(String nama) {
        super(nama);
    }

    // Selektor 
    public int getTunjangan() {
        return tunjangan;
    }

    // Mutator 
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
