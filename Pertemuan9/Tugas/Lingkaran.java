package Pertemuan9.Tugas;

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    
    public double getJejari() {
        return jejari;
    }
    
    public void setJejari(double jejari) {
        this.jejari = jejari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
    
    @Override
    public double hitungLuas() {
        return jejari * jejari * 3.14;
    }
}
